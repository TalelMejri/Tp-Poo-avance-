package ex4;

import java.util.HashMap;
import java.util.Map.Entry;

public class Annuaire {
	HashMap<String , Fiche> tab;
	public Annuaire() {
		this.tab=new HashMap<String,Fiche>();
	}
	
	public int getNBconttacts() {
		return this.tab.size();
	}
	
	public void addContact(Fiche f) {
		this.tab.put(f.getNom(), f);
	}
	
	public void addContact(String s, int n, String a) {
		Fiche newfiche=new Fiche(s,n,a);
		this.tab.put(s, newfiche);
	}
	
	public void addContact(String s) {
		Fiche newfiche=new Fiche(s);
		this.tab.put(s, newfiche);
	}
	
	public int getnumero(String name) {
		return this.tab.get(name).getNumero();
	}
	
	public void affiche() {
		/*Set<Entry<String,Fiche>> IT=this.tab.entrSet()
		Iterator<Entry<String,Fiche>> hm=IT.iterator();
		while(hm.hasnext()){
			s.o.p(hm.next());
		}*/
		for(Entry<String, Fiche> entree : this.tab.entrySet()) {
			System.out.println("key : "+entree.getKey()+" Values : "+entree.getValue());	
		}
	}
	
}
