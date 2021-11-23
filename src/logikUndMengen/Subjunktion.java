package logikUndMengen;

/**
 * WENN-DANN-Verknüpfung
 * Logiktabelle:
 * a | b | a->b
 * 0 | 0 |  1
 * 0 | 1 |  1
 * 1 | 0 |  0
 * 1 | 1 |  1
 * 
 * (a <= b)
 * 
 * Geschrieben: a -> b, gelesen "Wenn a, dann b"
 * 
 * Ist die Aussage a -> b wahr, spricht man von einem logischen Schluss, oder IMPLIKATION und schreibt a => b
 * 
 * a -> b subjunktion
 * a => b implikation(Wenn dann ist wahr)
 * 
 * @author Timo Lehnertz
 *
 */
public class Subjunktion extends Warheitswert {

	Aussage a;
	Aussage b;
	
	public Subjunktion(Aussage a, Aussage b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public boolean getValue() {
		return boolToInt(a.getValue()) <= boolToInt(b.getValue());
	}
	
	public static int boolToInt(boolean b) {
		return b ? 1 : 0;
	}
	
	public static void main(String[] args) {
		Subjunktion s = new Subjunktion(new Aussage("Es ist nebelig"), new Aussage("Die sicht ist schlecht"));
		System.out.println(s);
	}
	
	@Override
	public String toString() {
		boolean value = getValue();
		if(value) {
			return "a => b = Wahr(Implikation)";
		} else {
			return "a -> b = Falsch(Subjuntion)";
		}
	}
}