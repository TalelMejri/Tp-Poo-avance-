package ex1;

public class test {

	public static void main(String[] args) {
		
		/*PileTab tab=new PileTab();
		tab.add(4);
		tab.add(2);
		tab.affiche();
		System.out.println(tab.getSommet());
		System.out.println(tab.size());
		tab.remove();
		tab.affiche();*/

		PileTab<Integer> tab=new PileTab<>();
		System.out.println(tab.estVide());
		tab.add(45);
		tab.add(12);
		tab.add(48);
		System.out.println("For");
		tab.afficheFor();
	
		System.out.println("Foreach");
		tab.afficheForeach();
		System.out.println("Iterator");
		tab.afficherIterator();
		
		System.out.println("Size "+tab.size());
		System.out.println("Sommet "+tab.getSommet());
		tab.remove();
		tab.afficheFor();
		System.out.println(tab.estVide());
	}

}
