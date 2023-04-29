package Td;

public class ErrConst  extends Exception{
	private int error;
	public ErrConst() {
		super();
	}
	public ErrConst(String msg) {
		super(msg);
	}
	public ErrConst(int error) {
		this.error=error;
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
}
