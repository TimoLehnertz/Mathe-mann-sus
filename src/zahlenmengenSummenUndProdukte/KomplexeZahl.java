package zahlenmengenSummenUndProdukte;

/**
 * Komplexe Zahl bedeutet Zusammengesetzte Zahl aus Reeller und Imagin‰rer Zahl
 * 
 * Die Daarstellungsform z = x + iy heiﬂt Normalform einer Komplexen Zahl
 * 
 * @author Timo Lehnertz
 * 
 * @param <T>
 */
public class KomplexeZahl extends Imagin‰reZahl {

	ReelleZahl x;
	
	public KomplexeZahl(double x, double y) {
		super(y);
		this.x = new ReelleZahl(x);
	}
	
	public double getBetrag() {
		return Math.sqrt(x.getValue() * b.getValue());
	}
	
	/**
	 * Zie komplexe Zahl z* = x - yi heiﬂt die zu z = x + yi konjugiert komplexe Zahl
	 * 
	 * @return
	 */
	public KomplexeZahl getKonjugiert() {
		return new KomplexeZahl(x.getValue(), -b.getValue());
	}

	/**
	 * x+x, y+y
	 * 
	 * @param z
	 * @return
	 */
	public KomplexeZahl getAdded(KomplexeZahl z) {
		return new KomplexeZahl(x.getValue() + z.x.getValue(), b.getValue() + z.b.getValue());
	}
	
	/**
	 * z1 * z2 = (x1*x2 - y1*y2) + i(x1*y2 + x2*y2)
	 * 
	 * @param z
	 * @return
	 */
	public KomplexeZahl getMultiplied(KomplexeZahl z) {
		return new KomplexeZahl(
				x.getValue() * z.x.getValue() - b.getValue() * z.b.getValue(),
				b.getValue() * z.x.getValue() + x.getValue() * z.b.getValue());
	}
	
	/**
	 * TODO
	 * 
	 * @param z
	 * @return
	 */
	public KomplexeZahl getDivided(KomplexeZahl z) {
		return null;
	}
	
	/**
	 * x == x und y == y
	 * @param z
	 * @return
	 */
	public boolean equals(KomplexeZahl z) {
		return z.x.getValue() == x.getValue() && b.getValue() == z.b.getValue();
	}
}