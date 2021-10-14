package td2;

public class Add implements Expr{
	
//	int right;
//	int left;
//	
//	@Override
//	public double eval() {
//		// TODO Auto-generated method stub
//		return right+left;
//	}
	
	private final Expr right;
	private final Expr left;
	
	public Add(Val val1,Expr e) {
		this.right=val1;
		this.left=e;
		
	}
	@Override
	public double eval() {
		// TODO Auto-generated method stub
		return right.eval()+left.eval();
	}

}
