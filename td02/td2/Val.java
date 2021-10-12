package td2;

public class Val implements Expr{
	
	double val;
	public Val(double a) {
		this.val=a;
	}
	@Override
	public double eval() {
		// TODO Auto-generated method stub
		return val;
	}

}
