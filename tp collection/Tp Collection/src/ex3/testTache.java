package ex3;

public class testTache {
	public static void main(String[] args) {
		TacheComplexe tache=new TacheComplexe("Laravel");
		TacheElementaire tache1=new TacheElementaire("router", 4);
		TacheElementaire tache2=new TacheElementaire("api", 8);
		TacheElementaire tache5=new TacheElementaire("php", 2);
		TacheElementaire tache3=new TacheElementaire("blade", 15);
		TacheElementaire tache4=new TacheElementaire("js", 12);
		tache.addTache(tache3);
		tache.addTache(tache1);
		tache.addTache(tache2);
		tache.addTache(tache4);
		tache.addTache(tache5);
		//tache.afficherComplexe(tache);
		//System.out.println("Cout "+tache.getCout());
		//System.err.println("\n Apres Supprimer \n");
		//tache.removeTache(tache3);
		tache.TrierTache();
		tache.affichercomplexe(tache);
		//System.out.println("Cout "+tache.getCout());	
	}
}
