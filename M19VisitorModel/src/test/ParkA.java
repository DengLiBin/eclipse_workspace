package test;

public class ParkA implements ParkElement {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	

}
