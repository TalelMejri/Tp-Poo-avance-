package Comparaison;
public class Employ� extends Salari�{
private double Hsupp;
private double PHsupp;
public Employ�(int Matricule,String Nom,int Recrutement, double
Hsupp,double PHsupp){
super(Matricule,Nom,Recrutement);
this.Hsupp=Hsupp;
this.PHsupp=PHsupp;
}
public void setHsupp(double Hsupp){
this.Hsupp=Hsupp;}
public double getHsupp(){
return(this.Hsupp);}
public void setPHsupp(double PHsupp){
this.PHsupp=PHsupp;}
public double getPHsupp(){
return(this.PHsupp);}

@Override
public String toString() {
	return super.toString()+ "Employ� [Hsupp=" + Hsupp + ", PHsupp=" + PHsupp + "]";
}
public void Affiche(){
super.Affiche();
System.out.println(", nombre d'heures suppl�mentaires="+Hsupp+" et prix par heure suppl�mentaire= "+PHsupp);
}
public double Salaire(){
double sal=super.Salaire();
sal=sal+(Hsupp*PHsupp);
return sal;
}
}