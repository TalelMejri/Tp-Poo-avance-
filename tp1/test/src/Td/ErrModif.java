package Td;

public class ErrModif extends Exception {
	private int error;
	public ErrModif() {
		super();
	}
	public ErrModif(String msg) {
		super(msg);
	}
	public ErrModif(int error) {
		this.error=error;
	}
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
}
