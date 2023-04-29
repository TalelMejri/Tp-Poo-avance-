package ex3;

public class ExceptionAdrIP extends Exception {
	
	private int error;
	ExceptionAdrIP(){
		super();
	}
	
	ExceptionAdrIP(String message){
		super(message);
	}
	
	ExceptionAdrIP(int error){
		this.error=error;
	}

	public int getError() {
		return error;
	}

	public void setError(int error) {
		this.error = error;
	}
	
	public String toString() {
		return "Octet invalid";
	}

}
