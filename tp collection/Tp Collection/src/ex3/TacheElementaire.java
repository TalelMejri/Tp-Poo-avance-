package ex3;

public class TacheElementaire implements Tache {
	private String nom;
	private int cout;
	
	TacheElementaire(String nom,int cout){
		this.nom=nom;
		this.cout=cout;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	@Override
	public String toString() {
		return "TacheElementaire [nom=" + nom + ", cout=" + cout + "]";
	}

	
}
