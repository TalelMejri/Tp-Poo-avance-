package ex3;

public class adresseIP {
  int [] octet;
  
   public adresseIP(int o1,int o2,int o3,int o4) throws ExceptionAdrIP{
	   octet=new int[4];
	   if(o1<0 || o1>255) {
		   throw new ExceptionAdrIP(o1);
	   }
	   else if(o2<0 || o2>255) {
		   throw new ExceptionAdrIP(o2);
	   }
	   else if(o3<0 || o3>255) {
		   throw new ExceptionAdrIP(o3);
	   }
	   else if(o4<0 || o4>255) {
		   throw new ExceptionAdrIP(o4);
	   }
	   octet[0]=o1;
	   octet[1]=o2;
	   octet[2]=o3;
	   octet[3]=o4;
   }
   
   public String toString() {
	   return octet[0]+"."+octet[1]+"."+octet[2]+"."+octet[3];
   }
   
   public static void main(String[] args) {
	   try {
		   adresseIP e=new adresseIP(200, 4, 2, 5);
		   System.out.println(e);
	   }catch(ExceptionAdrIP e) {
		   System.err.println(e.getError()+" est invalid octet");
	   }
   }
   
}
