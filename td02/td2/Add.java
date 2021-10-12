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
	
	Val right;
	Expr left;
	
	public Add(Val val1,Expr e) {
		this.right=val1;
		if(e instanceof Val) {
			this.left=(Val)e;
		}else if(e instanceof Add) {
			this.left=(Add)e;
		}
		
	}
	@Override
	public double eval() {
		// TODO Auto-generated method stub
		return right.eval()+left.eval();
	}

}
