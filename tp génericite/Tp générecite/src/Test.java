
public class Test {

	public static void main(String[] args) {
		Point<Integer> p1=new Point<>(4,5);
		Point<Double> p2=new Point<>(4.5,5.2);
		Point<String> p3=new Point<>("Talel","Mejri");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		PointColoréNG pcng1=new PointColoréNG(4, 5,"red");
		System.out.println(pcng1);
		PointColoré<Integer, String> pc1=new PointColoré<>(4,5,"Black");
		System.out.println(pc1);
		CouleurRVB rvb=new CouleurRVB(255,255,255);
		PointColoré<Double,CouleurRVB> pc2=new PointColoré<>(4.5, 4.6, rvb);
		System.out.println(pc2);
		Cercle<Integer> c1=new Cercle<>(p1,4);
		System.out.println(c1);
		CercleAvecRestriction<Point> car1=new CercleAvecRestriction<Point>(4, p2);
		System.out.println(car1);
		CercleAvecRestriction<PointColoré> car2=new CercleAvecRestriction<PointColoré>(15, pc2);
		System.out.println(car2);
		
	}

}
