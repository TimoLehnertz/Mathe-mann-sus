package logikUndMengen;

/**
 * Die Kunjunktion, oder UND verkn�pfung ist Genau dann wahr, wenn sowohl a, als auch b wahr ist
 * 
 * Geschrieben: A /\ B
 * 
 * @author Timo Lehnertz
 *
 */
public class Konjunktion extends LogischeVerkn�pfung {
	
	public Konjunktion(Warheitswert... werte) {
		super(werte);
	}

	@Override
	public boolean getValue() {
		boolean value = true;
		for (Warheitswert warheitswert : werte) {
			value &= warheitswert.getValue();
		}
		return value;
	}
}