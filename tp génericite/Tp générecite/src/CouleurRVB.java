
public class CouleurRVB {
	private int vert;
	private int rouge;
	private int bleu;
	
	CouleurRVB(int v,int r,int b){
		this.vert=v;
		this.rouge=r;
		this.bleu=b;
	}
	public int getVert() {
		return vert;
	}
	public void setVert(int vert) {
		this.vert = vert;
	}
	public int getRouge() {
		return rouge;
	}
	public void setRouge(int rouge) {
		this.rouge = rouge;
	}
	public int getBleu() {
		return bleu;
	}
	public void setBleu(int bleu) {
		this.bleu = bleu;
	}
	  public String toString() {
		   return vert +" "+bleu+" "+rouge;
	   }
}
