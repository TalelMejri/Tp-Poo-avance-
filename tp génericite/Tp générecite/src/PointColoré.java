
public class PointColoré<T,T2> extends Point<T> {
	private T2 color;
	
	PointColoré(T abs,T ord,T2 color){
		super(abs,ord);
		this.color=color;
	}

	public T2 getColor() {
		return color;
	}

	public void setColor(T2 color) {
		this.color = color;
	}
	
    public String toString() {
		return super.toString()+" "+this.color;
	}
}
