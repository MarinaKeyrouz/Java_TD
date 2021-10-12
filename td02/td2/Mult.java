package td2;

public class Mult implements Expr{
	
	Val right;
	Expr left;

	public Mult(Val val1,Expr e) {
		this.right=val1;
		if(e instanceof Val) {
			this.left=(Val)e;
		}else if(e instanceof Add) {
			this.left=(Add)e;
		}else if(e instanceof Mult) {
			this.left=(Mult)e;
		}
		
	}
	@Override
	public double eval() {
		return right.eval()*left.eval();
	}
}
