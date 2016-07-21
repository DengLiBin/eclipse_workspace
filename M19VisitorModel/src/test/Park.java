package test;

public class Park implements ParkElement {
	private ParkA parka;
	private ParkB parkb;
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		parka.accept(visitor);
		parkb.accept(visitor);
	}
	public Park(){
		this.parka = new ParkA();
		this.parkb = new ParkB();
	}
}
