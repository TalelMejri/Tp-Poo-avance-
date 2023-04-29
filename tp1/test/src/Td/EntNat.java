package Td;

public class EntNat {
   private int x;
   EntNat(int nbr)  throws ErrConst{
	   if(nbr<0) {
		   throw new ErrConst(nbr);
	   }
	   this.x=nbr;
   }
public int getX() {
	return x;
}
public void setX(int x) throws ErrModif {
	if(x<0) {
		throw new ErrModif("Set Invalid");
	}
	this.x = x;
}

public void decremente() throws ErrModif {
	if((this.x-1)<0) {
		throw new ErrModif("Decremeente invalide");
	}
	this.x-=1;
}

static void decremente_global(EntNat e) throws ErrModif  {
	if((e.x-1)<0) {
		throw new ErrModif("Decremeente invalide globale");
	}
	e.x-=1;
}

   
   
}
