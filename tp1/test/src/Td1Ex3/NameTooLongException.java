package Td1Ex3;

public class NameTooLongException extends Exception {
	public NameTooLongException() {
		super();
	}
	public NameTooLongException(String msg) {
		super(msg);
	}
	public String toString() {
		return " n'excède pas les 20 caractères";
	}
}
