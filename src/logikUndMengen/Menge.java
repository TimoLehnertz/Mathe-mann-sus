package logikUndMengen;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Definition Menge:
 * Eine Menge ist eine Zusammenfassung von bestimmten und
 * unterscheidbaren Objekten unserer Anschauung oder unseres
 * Denkens zu einem Ganzen.
 * 
 * @author Timo Lehnertz
 *
 */
public class Menge<T> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;

	@SafeVarargs
	public Menge(T... inhalt) {
		super(Arrays.asList(inhalt));
	}
	
	public Menge() {
		super();
	}
	
	/**
	 * Eine Menge A heißt Teilmenge von B wenn gilt: x E A => x E B
	 * @param b Menge b
	 * @return ist b Teilmenge von this
	 */
	public boolean isTeilmenge(Menge<T> b) {
		return containsAll(b);
	}
	
	/**
	 * Die Menge A n B = {x | x E A /\ x E B} nennt man den Durchschnitt von a und b
	 * 
	 * Ist kummutativ, assoziativ und distributiv
	 * 
	 * @param b
	 * @return
	 */
	public Menge<T> getDurchschnitt(Menge<T> b) {
		Menge<T> teilmenge = new Menge<>();
		for (T x : this) {
			if(b.contains(x)) teilmenge.add(x);
		}
		return teilmenge;
	}
	
	/**
	 * Die Menge A u B = {x | x E A \/ x E B} nennt man Vereinigung von A und B
	 * 
	 * Ist kummutativ, assoziativ und distributiv
	 * 
	 * @param b
	 * @return
	 */
	public Menge<T> getVereinigung(Menge<T> b) {
		Menge<T> vereinigung = new Menge<>();
		vereinigung.addAll(this);
		vereinigung.addAll(b);
		return vereinigung;
	}
	
	/**
	 * Die Differenz zweier Mengen A\B = {x | x E A /\ x <-E> B} ist die
	 * Menge der Elemente von A ohne die Elemente von B
	 * 
	 * Ist speziell B eine Teilmenge von A, so nennt man 𝐴\B auch das
	 * Komplement von B in A und schreibt dafür <-B>. In diesem
	 * Zusammenhang bezeichnet man A als die Grundmenge.
	 * 
	 * @param b
	 * @return
	 */
	public Menge<T> getDifferenz(Menge<T> b) {
		Menge<T> differenz = clone();
		Menge<T> durchschnitt = getDurchschnitt(b);
		differenz.removeAll(durchschnitt);
		return differenz;
	}
	
	@Override
	public Menge<T> clone() {
		Menge<T> m = new Menge<>();
		for (T t : this) {
			m.add(t);
		}
		return m;
	}
	
	public static void main(String[] args) {
		Menge<Integer> a = new Menge<>(1,2,3,4,5);
		Menge<Integer> b = new Menge<>(3,4,5,6,7,8);
		Menge<Integer> c = a.getDurchschnitt(b);
		System.out.println(c);
	}
}