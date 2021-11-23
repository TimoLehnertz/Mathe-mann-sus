package logikUndMengen;

/**
 * Die Verneinung oder Negation einer Aussage a
 * ist GENAU dann wahr, wenn a falschn ist
 * 
 * Schreibweise: a verneint =  -a
 * 
 * @author Timo Lehnertz
 *
 */
public class Negation extends LogischeVerkn�pfung {

	private Warheitswert zuNegierendes;
	
	public Negation(Warheitswert zuNegierendes) {
		super(zuNegierendes);
		this.zuNegierendes = zuNegierendes;
	}

	@Override
	public boolean getValue() {
		return !zuNegierendes.getValue();
	}
}