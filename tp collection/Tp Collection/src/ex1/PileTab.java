package ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class PileTab<T> {
	ArrayList<T> tab;
	//int [] tab;
public PileTab(){
	tab=new ArrayList<>();
}
public void add(T e){
	tab.add(e);
}
public T remove(){
	return tab.remove(tab.size()-1);
}
public boolean estVide(){
	return tab.size()==0;
}
public int size(){
	return tab.size();
}
// for
public void afficheFor(){
	for(int i=0;i<tab.size();i++) {
		System.out.println(tab.get(i));
	}
}
//foreach
public void afficheForeach(){
	for(T val:tab) {
		System.out.println(val);
	}
}
//iterator
public void afficherIterator() {
	Iterator<T> trier_tab=tab.iterator();
	while(trier_tab.hasNext()) {
		System.out.println(trier_tab.next());
	}
}
public T getSommet(){
	return tab.get(tab.size()-1);
}

}