package td2;

public class Mult implements Expr{
	
	private final Expr right;
	private final Expr left;

	public Mult(Val val1,Expr e) {
		this.right=val1;
		this.left=e;
		
	}
	@Override
	public double eval() {
		return right.eval()*left.eval();
	}
}
