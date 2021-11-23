package zahlenmengenSummenUndProdukte;

/**
 * Alle negativen und positiven Integer
 * 
 * Schreibweise: ZZ
 * 
 * @author Timo Lehnertz
 *
 */
public class GanzeZahl extends NatürlicheZahl {

	public GanzeZahl(int value) {
		super(value);
	}
	
	@Override
	public long getMin() {
		return Long.MIN_VALUE;
	}
}