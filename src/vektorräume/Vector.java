package vektorräume;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition eines Vektors
 * @author Timo Lehnertz
 * @param <N>
 *
 */
public class Vector<T extends Number>{

	NumberList<T> values = new NumberList<>();
	
	@SafeVarargs
	public Vector(T... values) {
		super();
		for (T d : values) {
			this.values.addDouble(d.doubleValue());
		}
	}
	
	public static Float addFloat(Float a, Float b){
        return a + b;
    }
	
	private void addDouble(double d) {
		values.addDouble(d);
	}
	
	public static <N extends Number> Vector<N> add(Vector<N> a, Vector<N> b) {
		if(a.size() != b.size()) throw new RuntimeException("Cant calculate with Vectors of different sizes");
		Vector<N> c = new Vector<>();
		for (int i = 0; i < a.size(); i++) {
			c.addDouble(a.get(i).doubleValue() + b.get(i).doubleValue());
		}
		return c;
	}
	
	public static <N extends Number> Vector<N> subtract(Vector<N> a, Vector<N> b) {
		if(a.size() != b.size()) throw new RuntimeException("Cant calculate with Vectors of different sizes");
		Vector<N> c = new Vector<>();
		for (int i = 0; i < a.size(); i++) {
			c.addDouble(a.get(i).doubleValue() - b.get(i).doubleValue());
		}
		return c;
	}
	
	public static <N extends Number> Vector<N> multiply(Vector<N> a, Vector<N> b) {
		if(a.size() != b.size()) throw new RuntimeException("Cant calculate with Vectors of different sizes");
		Vector<N> c = new Vector<>();
		for (int i = 0; i < a.size(); i++) {
			c.addDouble(a.get(i).doubleValue() * b.get(i).doubleValue());
		}
		return c;
	}
	
	public static <N extends Number> Vector<N> divide(Vector<N> a, Vector<N> b) {
		if(a.size() != b.size()) throw new RuntimeException("Cant calculate with Vectors of different sizes");
		Vector<N> c = new Vector<>();
		for (int i = 0; i < a.size(); i++) {
			c.addDouble(a.get(i).doubleValue() + b.get(i).doubleValue());
		}
		return c;
	}
	
	T get(int index) {
		return values.get(index);
	}
	
	public int size() {
		return values.size();
	}
	
	@SuppressWarnings("unchecked")
	public T getLength() {
		double sum = 0;
		for (T number : values) {
			sum += number.doubleValue() * number.doubleValue();
		}
		return (T) Double.valueOf(Math.sqrt(sum));
	}
	
	public T getX() {
		if(values.size() < 1) throw new RuntimeException("Cant get x of vector length 0");
		return values.get(0);
	}
	
	public T getY() {
		if(values.size() < 2) throw new RuntimeException("Cant get x of vector length < 2");
		return values.get(1);
	}
	
	public T getZ() {
		if(values.size() < 3) throw new RuntimeException("Cant get z of vector length < 3");
		return values.get(2);
	}
	
	public static void main(String[] args) {
		Vector<Float> a = new Vector<>(1.0f,2.0f,3.0f);
		Vector<Float> b = new Vector<>(1.0f,2.0f,3.0f);
		Vector<Float> c = Vector.add(a, b);
		System.out.println(c);
		System.out.println(c.getLength());
	}
	
	@Override
	public String toString() {
		return values.toString();
	}
}
