package zahlenmengenSummenUndProdukte;

/**
 * Alle positiven Integer und 0
 * 
 * Schreibweise: NN0
 * 
 * @author Timo Lehnertz
 *
 */
public class Nat�rlicheZahl0 extends Nat�rlicheZahl {
	
	public Nat�rlicheZahl0(int value) {
		super(value);
	}

	@Override
	public long getMin() {
		return 0;
	}
	
	public static void main(String[] args) {
		Nat�rlicheZahl0 z = new Nat�rlicheZahl0(0);
		System.out.println(z);
	}
}