package logikUndMengen;

public abstract class Warheitswert {

	public abstract boolean getValue();
	
	@Override
	public String toString() {
		return getValue() ? "Wahr" : "Falsch";
	}
}