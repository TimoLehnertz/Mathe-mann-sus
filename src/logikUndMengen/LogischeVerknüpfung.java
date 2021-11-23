package logikUndMengen;

import java.util.Arrays;
import java.util.List;

/**
 * Eine Logische verknupfung besteht aus n Logischen werten
 * @author Timo Lehnertz
 *
 */
public abstract class LogischeVerknüpfung extends Warheitswert {

	protected List<Warheitswert> werte;
	
	public LogischeVerknüpfung(Warheitswert wert) {
		this(Arrays.asList(wert));
	}
	
	public LogischeVerknüpfung(Warheitswert[] werte) {
		this(Arrays.asList(werte));
	}
	
	public LogischeVerknüpfung(List<Warheitswert> werte) {
		super();
		this.werte = werte;
	}
	
	public List<Warheitswert> getWerte() {
		return werte;
	}
	
	public void printWarheitstabelle() {
		
	}
}