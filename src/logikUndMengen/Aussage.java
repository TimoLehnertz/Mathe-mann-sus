package logikUndMengen;

import utils.Utils;

/**
 * Eine Aussage ist ein Satz, dem man
 * eindeutig einen Wahrheitswert(true oder false) zuordnen kann
 * @author Timo Lehnertz
 *
 */
public class Aussage extends Warheitswert {

	String satz;
	boolean value;
	boolean valueSet = false;
	
	public Aussage(String satz) {
		super();
		this.satz = satz;
	}
	
	public boolean getValue() {
		if(valueSet) return value;
		else {
			value = Utils.askBooleanValue(satz);
			valueSet = true;
		}
		return value;
	}
}