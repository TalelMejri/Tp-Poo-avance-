package Comparaison;
public class Salarié {
private int Matricule;
private String Nom;
private int Recrutement;
public Salarié(int Matricule,String Nom,int Recrutement){
this.Matricule=Matricule;
this.Nom=Nom;
this.Recrutement=Recrutement;
}
public void setMatricule(int Matricule){
this.Matricule=Matricule;}
public int getMatricule(){
return(this.Matricule);}
public void setNom(String Nom){
this.Nom=Nom;}
public String getNom(){
return(this.Nom);}
public void setRecrutement(int Recrutement){
this.Recrutement=Recrutement;}
public int getRecrutement(){
return(this.Recrutement);}
public double Salaire(){
if (Recrutement<2005) return 400;
else return 280;
}

@Override
public String toString() {
	return "Salarié [Matricule=" + Matricule + ", Nom=" + Nom
			+ ", Recrutement=" + Recrutement +"  Salaire = "+ this.Salaire()+"]";
}
public void Affiche(){
System.out.print("Matricule= "+Matricule+" ,Nom= "+Nom+", Année de recrutement= "+Recrutement);
}
}
