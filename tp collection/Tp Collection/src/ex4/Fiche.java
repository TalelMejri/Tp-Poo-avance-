package ex4;

public class Fiche {
   private String nom;
   private int numero;
   private String adresse;
   
   Fiche(String nom,int num,String adre){
	   this.nom=nom;
	   this.numero=num;
	   this.adresse=adre;
   }
   
   Fiche(String nom){
	   this.nom=nom;
	   this.adresse=null;
	   this.numero=-1;
   }

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}
 public String toString() {
	 return this.nom +" "+this.numero+" "+this.adresse;
 }
}
