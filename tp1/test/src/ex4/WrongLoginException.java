package ex4;

public class WrongLoginException extends Exception {
	WrongLoginException(){
		super();
	}
	
	WrongLoginException(String message){
		super(message);
	}
	
	public String toString() {
		return "Email Incorrect";
	}
	
}
