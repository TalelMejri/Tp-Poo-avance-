package ex4;

public class Test {

	public static void main(String[] args) {
		Annuaire a=new Annuaire();
		a.addContact(new Fiche("talel"));
		a.addContact("mejri");
		a.addContact("badis", 29036027, "Elkef");
		System.out.println("Nombre "+a.getNBconttacts()); 
		a.affiche();
		try {
			System.out.println("NUMERO DE mejri : "+a.getnumero("badis"));
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}	

}
