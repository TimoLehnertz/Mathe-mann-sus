package zahlenmengenSummenUndProdukte;

/**
 * Alle Zahlen, die durch einen Bruch daargestellt werden können(Ratio)
 * 
 * Schreibweise QQ
 * 
 * @author Timo Lehnertz
 *
 */
public class RationaleZahl extends ZahlenMenge<Double> {

	double value;
	
	public RationaleZahl(double value) {
		super();
		this.value = value;
	}

	@Override
	public Double getValue() {
		return value;
	}
}