package ex2;

public interface Pile<T> {
	public boolean estVide();
	public T dernier();
	public void depiler();
	public void empiler(T o);
}
