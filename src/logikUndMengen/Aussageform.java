package logikUndMengen;

import java.util.Arrays;
import java.util.List;

import utils.Utils;

/**
 * Ersetzt man in einer Aussage eine Konstante durch
 * eine Variable, erhält man iene Aussageform a(x) auch Aussagefunktion genannt
 * 
 * @author Timo Lehnertz
 *
 */
public class Aussageform extends Aussage implements Negierbar {

	protected List<Variable> variables;
	protected boolean negiert = false;
	
	protected Aussageform(String satz, List<Variable> variable) {
		super(satz);
		this.variables = variable;
	}
	
	public Aussageform(String satz, Variable variable) {
		super(satz);
		this.variables = Arrays.asList(variable);
	}
	
	@Override
	public boolean getValue() {
		boolean value = Utils.askBooleanValue(variables.get(0) + "; " + satz);
		if(negiert) value = !value;
		return value;
	}
	
	@Override
	public Aussageform getNegation() {
		Aussageform a = new Aussageform(satz, variables);
		a.negiert = !a.negiert;
		return a;
	}
}