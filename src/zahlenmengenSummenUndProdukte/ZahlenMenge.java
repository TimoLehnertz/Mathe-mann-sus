package zahlenmengenSummenUndProdukte;

public abstract class ZahlenMenge<T> {

	public ZahlenMenge() {
		super();
	}
	
	public abstract T getValue();
	
	@Override
	public String toString() {
		return getValue() + "";
	}
}