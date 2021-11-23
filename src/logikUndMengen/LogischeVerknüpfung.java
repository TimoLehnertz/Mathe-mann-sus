package logikUndMengen;

import java.util.Arrays;
import java.util.List;

/**
 * Eine Logische verknupfung besteht aus n Logischen werten
 * @author Timo Lehnertz
 *
 */
public abstract class LogischeVerkn�pfung extends Warheitswert {

	protected List<Warheitswert> werte;
	
	public LogischeVerkn�pfung(Warheitswert wert) {
		this(Arrays.asList(wert));
	}
	
	public LogischeVerkn�pfung(Warheitswert[] werte) {
		this(Arrays.asList(werte));
	}
	
	public LogischeVerkn�pfung(List<Warheitswert> werte) {
		super();
		this.werte = werte;
	}
	
	public List<Warheitswert> getWerte() {
		return werte;
	}
	
	public void printWarheitstabelle() {
		
	}
}