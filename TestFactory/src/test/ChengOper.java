package test;

public class ChengOper extends Operation{

	@Override
	public void setNum1(double num1) {
		this.num1=num1;
		
	}

	@Override
	public void setNum2(double num2) {
		this.num2=num2;
	}


	@Override
	public double getResult() {
		return num1 * num2;
	}

	
	
}
