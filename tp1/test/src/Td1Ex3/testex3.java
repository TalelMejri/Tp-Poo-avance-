package Td1Ex3;

import java.util.InputMismatchException;

public class testex3 {
	public static void main(String[] args) {
		int trouve=0;
		while(trouve==0) {
		    try {
				Projet p=new Projet();
				trouve=1;
			}catch(NameTooLongException e) {
				System.out.println(e);
			}catch(WrongDurationException e) {
				System.out.println(e);
			}
			catch(InputMismatchException e) {
				System.out.println(e);
			}
		}
	}
}
