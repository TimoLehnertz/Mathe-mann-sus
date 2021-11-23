package logikUndMengen;

/**
 * Die disjuntion(Oder) verkn�pfung ist genau dann wahr, wenn
 *
 * Geschrieben: A \/ B
 * 
 * @author Timo Lehnertz
 *
 */
public class Disjunktion extends LogischeVerkn�pfung {
	
	public Disjunktion(Warheitswert... werte) {
		super(werte);
	}

	@Override
	public boolean getValue() {
		boolean value = false;
		for (Warheitswert warheitswert : werte) {
			value |= warheitswert.getValue();
		}
		return value;
	}
}