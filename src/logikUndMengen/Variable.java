package logikUndMengen;

import java.util.ArrayList;
import java.util.List;

public class Variable {

	public static final List<Variable> variablen = new ArrayList<>();
	
	private String name;
	private Object value;
	
	private long lastModification;
	private long writes;
	
	public Variable(String name, Object value) {
		super();
		if(nameExists(name)) {
			throw new RuntimeException("Variable with name " + name + " already exists");
		}
		this.name = name;
		writes = 0;
		setValue(value);
		variablen.add(this);
	}
	
	private static boolean nameExists(String name) {
		for (Variable variable : variablen) {
			if(variable.name.contentEquals(name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return name + "=" + value;
	}
	
	public void setValue(Object value) {
		if(value == this.value) return;
		this.value = value;
		writes++;
		lastModification = System.currentTimeMillis();
	}
	
	public String getName() {
		return name;
	}
	
	public Object getValue() {
		return value;
	}
	
	public long getLastModification() {
		return lastModification;
	}
	
	public long getWrites() {
		return writes;
	}
}