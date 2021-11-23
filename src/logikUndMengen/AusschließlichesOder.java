package logikUndMengen;

/**
 * Das ausschlie�liche oder ist genau dann wahr,
 * wenn genau eine der werte den warheitswert wahr haben
 * 
 * Geschrieben: A xor B   (auch: O mit x drinn)
 * 
 * @author Timo Lehnertz
 *
 */
public class Ausschlie�lichesOder extends LogischeVerkn�pfung {

	public Ausschlie�lichesOder(Warheitswert... werte) {
		super(werte);
	}

	@Override
	public boolean getValue() {
		boolean value = false;
		for (Warheitswert warheitswert : werte) {
			if(warheitswert.getValue()) {
				if(value) return false;
				value = true;
			}
		}
		return value;
	}
}