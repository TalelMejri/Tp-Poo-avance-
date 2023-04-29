package Td1Ex3;

public class WrongDurationException extends Exception {
	public WrongDurationException() {
		super();
	}
	public WrongDurationException(String msg) {
		super(msg);
	}
	public String toString() {
		return "entier Negative";
	}
}
