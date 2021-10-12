package td2;

public class Racine implements Expr{
	Val right;
	Expr left;

	public Racine(Val val1) {
		this.right=val1;
		
	}
	@Override
	public double eval() {
		return Math.sqrt(right.eval());
	}

}
