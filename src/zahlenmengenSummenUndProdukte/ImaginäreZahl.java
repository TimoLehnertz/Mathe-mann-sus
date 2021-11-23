package zahlenmengenSummenUndProdukte;

public class Imagin�reZahl extends ZahlenMenge<Double> {

	Imagin�reEinheit i;
	ReelleZahl b;
	
	public Imagin�reZahl(double b) {
		if(b == 0) {
			throw new RuntimeException("b cant be 0");
		}
		this.b = new ReelleZahl(b);
	}

	@Override
	public Double getValue() {
		return b.getValue();
	}
}