package ex2;


	public interface IPile <A> {
		boolean estVide();
		void empile(A a);
		A depile(); // retourne l'élément en sommet de pile et dépile
		int nbElements();
		A sommet(); // retourne le sommet de pile mais ne le dépile pas
		}


