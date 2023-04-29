
public class Cercle<T> {
  private int rayon;
  private Point<T> point;
  public Cercle(Point<T> p,int r) {
	  this.rayon=r;
	  this.point=p;
  }
public int getRayon() {
	return rayon;
}
public void setRayon(int rayon) {
	this.rayon = rayon;
}
public Point<T> getPoint() {
	return point;
}
public void setPoint(Point<T> point) {
	this.point = point;
}
  public String toString() {
	  return rayon+" "+this.point;
  }
}
