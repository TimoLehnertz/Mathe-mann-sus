package zahlenmengenSummenUndProdukte;

/**
 * Alle Rationalen Zahlen und solche wie PI
 * 
 * Schreibweise: RR
 * 
 * @author Timo Lehnertz
 *
 */
public class ReelleZahl extends RationaleZahl {

	public ReelleZahl(double value) {
		super(value);
	}
	
	/**
	 * Abrundungsfunktion |_x_|
	 * 
	 * @return
	 */
	public ReelleZahl getAbgerundet() {
		return new ReelleZahl(Math.floor(value));
	}
	
	/**
	 * Aufrundungsfunktion |-x-|
	 * 
	 * @return
	 */
	public ReelleZahl getAufgerunden() {
		return new ReelleZahl(Math.ceil(value));
	}
}