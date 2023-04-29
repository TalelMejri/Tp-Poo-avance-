
public class CercleAvecRestriction<T extends Point> {
 private int rayon;
 private T point;
 CercleAvecRestriction(int r, T p){
	 rayon=r;
	 point=p;
 }
public int getRayon() {
	return rayon;
}
public void setRayon(int rayon) {
	this.rayon = rayon;
}
public T getPoint() {
	return point;
}
public void setPoint(T point) {
	this.point = point;
}
 public String toString() {
	 return rayon+" "+point;
}
 
}

