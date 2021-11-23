package logikUndMengen;

import java.util.Arrays;
import java.util.List;

import utils.Utils;

/**
 * Die Aussage "für alle x (aus einer Menge) gilt a(x)"
 * ist genau dann wahr, wenn a(x) für alle in frage kommenden x wahr ist
 * 
 * Geschrieben: <umgedrehtes A>x : a(x), gelesen: "Für alle x gilt a(x)" Das umgedrehte a heißt All-Quantor
 * 
 * @author Timo Lehnertz
 *
 */
public class AllAussage extends Aussageform implements Negierbar {
	
	public AllAussage(String satz, List<Variable> variable) {
		super(satz, variable);
	}
	
	@Override
	public boolean getValue() {
		boolean value = true;
		for (Variable variable : variables) {
			boolean tmp = Utils.askBooleanValue(variable + "; " + satz);
			if(negiert) tmp = !tmp;
			value &= tmp;
		}
		return value;
	}

	/**
	 * Die Negation einer All aussage ist eine Existenz Aussage mit negierten Aussagen
	 */
	@Override
	public ExistenzAussage getNegation() {
		ExistenzAussage e = new ExistenzAussage(satz, variables);
		e.negiert = !e.negiert;
		return e;
	}
	
	public static void main(String[] args) {
		AllAussage a = new AllAussage("x < 5", Arrays.asList(new Variable("x", 10), new Variable("y", 5),  new Variable("z", 4)));
		ExistenzAussage b = a.getNegation();
		System.out.println(a.getValue());
		System.out.println(b.getValue());
	}
}