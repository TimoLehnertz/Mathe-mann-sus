package logikUndMengen;

public class Konstante extends Variable {

	public Konstante(String name, Object value) {
		super(name, value);
	}

	@Override
	public void setValue(Object value) {
		throw new RuntimeException("Cant set Value for konstant " + this.getName());
	}
}