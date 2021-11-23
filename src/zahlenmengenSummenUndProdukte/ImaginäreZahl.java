package zahlenmengenSummenUndProdukte;

public class ImaginäreZahl extends ZahlenMenge<Double> {

	ImaginäreEinheit i;
	ReelleZahl b;
	
	public ImaginäreZahl(double b) {
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