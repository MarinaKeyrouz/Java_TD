package td2;

public class Racine implements Expr{
	private final Expr right;
	
	public Racine(Val val1) {
		this.right=val1;
		
	}
	@Override
	public double eval() {
		return Math.sqrt(right.eval());
	}

}
