package zahlenmengenSummenUndProdukte;

/**
 * Alle positiven Integer ohne 0
 * 
 * Schreibweise: NN
 * 
 * @author Timo Lehnertz
 *
 */
public class Nat�rlicheZahl extends ZahlenMenge<Long> {

	private long value;
	
	public Nat�rlicheZahl(int value) {
		if(value < getMin()) {
			throw new RuntimeException("Eine nat�rliche Zahl kann nicht kleiner als " + getMin() + " sein!");
		}
		this.value = value;
	}
	
	public long getMin() {
		return 1;
	}
	
	@Override
	public Long getValue() {
		return value;
	}
}