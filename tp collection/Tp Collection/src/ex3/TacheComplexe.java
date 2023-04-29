package ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TacheComplexe implements Tache {
    ArrayList<Tache> tab;
   private String nom;
 
   TacheComplexe(String nom){
	   tab=new ArrayList<>();
	   this.nom=nom;
   }
   
   public String getNom() {
	   return this.nom;
   }
   
   public int getCout() {
	   int totale=0;
	   for(Tache val:tab) {
		   totale+=val.getCout();
	   }
	   return totale;
   }
   
   public void addTache(Tache a) {
	   tab.add(a);
   }
   
   public void removeTache(Tache a) {
	   tab.remove(a);
   }
   
   public void TrierTache() {
	   Collections.sort(tab,new Comparator<Tache>() {
		@Override
		public int compare(Tache o1, Tache o2) {
			Integer cout1=o1.getCout();
			Integer cout2=o2.getCout();
			return cout1.compareTo(cout2);
		}
	});
   }
   
   public void affichercomplexe(Tache a) {
	   String message="Mon tache :"+a.getNom() + " \n";
	   for(Tache val:tab) {
		   message+=val.getNom()+" : "+val.getCout()+" \n" ;
	   }
	   System.out.println(message);
   }

}
