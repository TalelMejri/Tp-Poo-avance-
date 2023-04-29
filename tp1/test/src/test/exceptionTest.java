package test;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.InflaterOutputStream;

public class exceptionTest {

	public static void main(String[] args) {
		int a, b, res;
		Scanner clavier = new Scanner(System.in);
			try {
				System.out.println("a =");
				a = clavier.nextInt();
				System.out.println("b =");
				b = clavier.nextInt();
				res = a / b;
				System.out.println(a + " / " + b + " = " + res);
			}
			catch( ArithmeticException e){
				System.out.println("oops ! un problème dans la division");
				System.out.println ("le message officiel est " + e.getMessage()) ;
			}
			catch( InputMismatchException e){
				System.out.println("lettre incorrect");
				System.out.println ("le message officiel est " + e.getMessage()) ;
			}
			finally {
				System.out.println("le bloc finally sera toujours exécuté") ;
				System.out.println("c'est là qu'on fermera par exemple les fichiers") ;
			}

		clavier.close();
		System.out.println ("Fin du programme") ;
	}

}
