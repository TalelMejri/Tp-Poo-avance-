package ex4;

import java.util.Scanner;

public class Authentification {
	static final String email="scott";
	static final String Password="tiger";
	
	Authentification(){
		boolean email=false;
		boolean pass=false;
		while(email==false || pass==false) {
		try {
			while(email==false) {
				this.getUserLogin();
				email=true;
			}
			while(pass==false) {
				this.getUserPwd();
				pass=true;
			}
			System.out.println("Welcome "+this.email);
		}catch(WrongInputLength e) {
			System.err.println(e);
		}catch(WrongLoginException e) {
			System.err.println(e);
		}catch(WrongPwdException e) {
			System.err.println(e);
		}
	   }
	}
	
	public void getUserLogin() throws WrongLoginException,WrongInputLength{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email :");
		String email_saisir=sc.next();
		if(email_saisir.length()>10) {
			throw new WrongInputLength();
		}else if(!email_saisir.equals(email)) {
			throw new WrongLoginException();
		}
	}
	
	public void getUserPwd() throws WrongPwdException,WrongInputLength{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Paswword :");
		String password_saisir=sc.next();
		if(password_saisir.length()>10) {
			throw new WrongInputLength();
		}else if(!password_saisir.equals(Password)) {
			throw new WrongPwdException();
		}
	}
	
}
