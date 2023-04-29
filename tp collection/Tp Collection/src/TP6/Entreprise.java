package TP6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Entreprise {
  private String nom;
  private ArrayList<Salarié> tabsalaire;
  
  Entreprise(String nom){
	  this.tabsalaire=new ArrayList<>();
	  this.nom=nom;
  }
  
  public void embaucherSalarie(Salarié s) {
	  tabsalaire.add(s);
  }
  
  public void licencierSalarie(Salarié s) {
	  tabsalaire.remove(s);
  }
  
  public boolean travailDansEntreprise(Salarié s) {
	  return tabsalaire.contains(s);
  }
  
  public void afficherSalariés() {
	  Iterator<Salarié> it=tabsalaire.iterator();
	  while(it.hasNext()) {
		  System.out.println(it.next());
	  }
  }
  
  public double totalSalaire() {
	  double  totale=0;
	  for(Salarié val:tabsalaire) {
		  totale+=val.Salaire();
	  }
	  return totale;
  }
  
  public void trieSalarieParNom() {
	  Collections.sort(tabsalaire,new Comparator<Salarié>() {
		  public int compare(Salarié o1, Salarié o2) {
			   return o1.getNom().compareTo(o2.getNom());
		  }
	});
  }
  
  public void trieSalariéParAncnneté() {
	  Collections.sort(tabsalaire,new Comparator<Salarié>() {
		  public int compare(Salarié o1, Salarié o2) {
			  Integer num1=o1.getRecrutement();
			  Integer num2=o2.getRecrutement();
			  return num1.compareTo(num2);
		  }
	});
  }
  
  public void trieSalariéParSalaire() {
	  Collections.sort(tabsalaire,new Comparator<Salarié>() {
		  public int compare(Salarié o1, Salarié o2) {
			  Double num1=o1.Salaire();
			  Double num2=o2.Salaire();
			   return num1.compareTo(num2);
		  }
	});
  }
  
}
