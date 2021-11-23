package vektorräume;

import java.util.ArrayList;

public class NumberList<T extends Number> extends ArrayList<T> {

	private static final long serialVersionUID = 1L;

	@SafeVarargs
	public NumberList(T... values) {
		super();
		for (T t : values) {
			addDouble(t.doubleValue());
		}
	}
	
	@SuppressWarnings("unchecked")
	void addDouble(double d) {
		super.add((T) (Double.valueOf(d)));
	}
}
