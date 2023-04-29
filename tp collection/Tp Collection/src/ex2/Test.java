package ex2;

public class Test {
	public static void main(String[]args) {
		 System.out.println("\n \n Integer : \n ");
		CPile<Integer> tab_integer=new CPile<>();
		
		tab_integer.empile(4);
		tab_integer.empile(5);
		System.err.println("Sommet  "+tab_integer.sommet());
		System.err.println("size: "+tab_integer.nbElements());
		tab_integer.depile();
		System.err.println("size apres supprimer "+tab_integer.nbElements());
		System.err.println("Sommet "+tab_integer.sommet());
		
		
	    System.out.println("\n \n String : \n ");
		CPile<String> tab_String=new CPile<>();
		
		tab_String.empile("Talel");
		tab_String.empile("malek");
		System.out.println("Sommet "+tab_String.sommet());
		System.out.println("size: "+tab_String.nbElements());
		tab_String.depile();
		System.out.println("size apres supprimer "+tab_String.nbElements());
		System.out.println("Sommet "+tab_String.sommet());
	
	}
	
}
