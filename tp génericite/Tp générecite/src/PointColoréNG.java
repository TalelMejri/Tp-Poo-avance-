
public class PointColoréNG extends Point<Integer> {
   private String color;
   
   public PointColoréNG(int abs,int ord,String color) {
	   super(abs,ord);
	   this.color=color;
   }
   
   public String toString() {
	   return super.toString()+" "+this.color;
   }
}
