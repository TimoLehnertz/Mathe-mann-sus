package zahlenmengenSummenUndProdukte;

/**
 * Alle positiven Integer ohne 0
 * 
 * Schreibweise: NN
 * 
 * @author Timo Lehnertz
 *
 */
public class NatürlicheZahl extends ZahlenMenge<Long> {

	private long value;
	
	public NatürlicheZahl(int value) {
		if(value < getMin()) {
			throw new RuntimeException("Eine natürliche Zahl kann nicht kleiner als " + getMin() + " sein!");
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