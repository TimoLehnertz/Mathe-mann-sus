package logikUndMengen;

import java.util.Arrays;
import java.util.List;

import utils.Utils;

/**
 * Die Aussage "Es gibt ein x (aus einer Menge), sodass a(x)"
 * ist genau dann wahr, wenn a(x) für mindestems eines der
 * in frage kommenden x wahr ist
 * 
 * Geschrieben: <Gespiegelts E>x : a(x), gelesen "Es gibt mind. ein x für das a(x) gilt" Das symbol <Gespiegelts E> heißt Existenz-Quantor
 * 
 * @author Timo Lehnertz
 *
 */
public class ExistenzAussage extends Aussageform implements Negierbar {
	
	public ExistenzAussage(String satz, List<Variable> variable) {
		super(satz, variable);
	}
	
	@Override
	public boolean getValue() {
		for (Variable variable : variables) {
			boolean tmp = Utils.askBooleanValue(variable + "; " + satz);
			if(negiert) tmp = !tmp;
			if(tmp) return true;
		}
		return false;
	}

	/**
	 * Die Negation einer Existenz aussage ist eine All Aussage mit negierten aussagen
	 */
	@Override
	public AllAussage getNegation() {
		AllAussage a = new AllAussage(satz, variables);
		a.negiert = !a.negiert;
		return a;
	}
	
	public static void main(String[] args) {
		ExistenzAussage a = new ExistenzAussage("x < 5", Arrays.asList(new Variable("x", 1), new Variable("y", 2),  new Variable("z", 3)));
		AllAussage b = a.getNegation();
		System.out.println(a.getValue());
		System.out.println(b.getValue());
	}
}