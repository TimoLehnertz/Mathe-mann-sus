package zahlenmengenSummenUndProdukte;

/**
 * Alle positiven Integer und 0
 * 
 * Schreibweise: NN0
 * 
 * @author Timo Lehnertz
 *
 */
public class NatürlicheZahl0 extends NatürlicheZahl {
	
	public NatürlicheZahl0(int value) {
		super(value);
	}

	@Override
	public long getMin() {
		return 0;
	}
	
	public static void main(String[] args) {
		NatürlicheZahl0 z = new NatürlicheZahl0(0);
		System.out.println(z);
	}
}