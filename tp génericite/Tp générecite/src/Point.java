
public class Point<T> {
	
	private T abs;
	private T ord;
	
	public Point(T abs,T ord) {
		this.abs=abs;
		this.ord=ord;
	}
	
	public T getAbs() {
		return abs;
	}
	public void setAbs(T abs) {
		this.abs = abs;
	}
	public T getOrd() {
		return ord;
	}
	public void setOrd(T ord) {
		this.ord = ord;
	}
	
	public String toString() {
		return this.ord+" "+this.abs;
	}


}
