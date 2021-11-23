package logikUndMengen;

/**
 * GENAU-DADD-Verknüpfung (a == b)
 * Bijunktion
 * Ist die verknüpfte Ausage a <-> b wahr, so spricht man
 * von einer Äquivalenz und schreibt a <=> b
 * 
 * Geschrieben: a <-> b, gelesen "a genau dann, wenn b"
 * 
 * @author Timo Lehnertz
 *
 */
public class Bijunktion extends Warheitswert {

	Aussage a;
	Aussage b;
	
	public Bijunktion(Aussage a, Aussage b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	@Override
	public boolean getValue() {
		return a.getValue() == b.getValue();
	}
	
	public static void main(String[] args) {
		Subjunktion s = new Subjunktion(new Aussage("Es ist nebelig"), new Aussage("Die sicht ist schlecht"));
		System.out.println(s);
	}
}
