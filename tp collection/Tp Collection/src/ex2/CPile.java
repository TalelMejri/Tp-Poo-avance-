package ex2;

import java.util.LinkedList;

public class CPile<T> implements IPile<T> {
   LinkedList<T> list;
   
   public CPile(){
	   list=new LinkedList<>();
   }
    
   public boolean estVide() {
	   return list.isEmpty();
   }
   
   public void empile(T a) {
	   list.addFirst(a);
   }
   
   public T depile() {
	   list.removeFirst();
	   return list.getFirst();
   }
   
   public int nbElements() {
	   return list.size();
   }
   
   public T sommet() {
	   return list.peek();
   }
    
    
}
