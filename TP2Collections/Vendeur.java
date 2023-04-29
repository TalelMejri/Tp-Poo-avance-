package Comparaison;
public class Vendeur extends Salarié{
private double Vente;
private double Pourcentage;
public Vendeur(int Matricule,String Nom,int Recrutement,double Vente,
double Pourcentage){
	super(Matricule,Nom,Recrutement);
	this.Vente=Vente;
	this.Pourcentage=Pourcentage;
	}
	public void setVente(double Vente){
	this.Vente=Vente;}
	public double getVente(){
	return(this.Vente);}
	public void setPourcentage(double Pourcentage){
	this.Pourcentage=Pourcentage;}
	public double getPourcentage(){
	return(this.Pourcentage);}
	public double Salaire(){
	double sal=super.Salaire();
	sal=sal+(Vente*Pourcentage);
	return sal;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Vendeur [Vente=" + Vente + ", Pourcentage=" + Pourcentage + "]";
	}
	public void Affiche(){
	super.Affiche();
	System.out.println(", total des ventes par mois (Dinars)="+Vente+" et pourcentage sur les ventes: "+Pourcentage+" %");
	}
	}