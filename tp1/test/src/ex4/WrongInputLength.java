package ex4;

public class WrongInputLength extends Exception {
	WrongInputLength(){
		super();
	}
	
	WrongInputLength(String message){
		super(message);
	}
	
	public String toString() {
		return "Le champs doit etre superieur a 10";
	}
}
