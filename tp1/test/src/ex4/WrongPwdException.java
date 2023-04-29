package ex4;

public class WrongPwdException extends Exception {
	WrongPwdException(){
		super();
	}
	
	WrongPwdException(String message){
		super(message);
	}
	
	public String toString() {
		return "Password Incorrect";
	}
}
