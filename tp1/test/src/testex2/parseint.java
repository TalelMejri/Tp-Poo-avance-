package testex2;

public class parseint {
	
	public static void main (String [] args)  {
		int somme=0;
		for(int i=0;i<args.length;i++) {
			try {
				somme+=Integer.parseInt(args[i]);
			}catch(NumberFormatException e) {}
		}
		System.out.println(somme);
	}
}	
