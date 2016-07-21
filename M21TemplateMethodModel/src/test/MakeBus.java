package test;

public class MakeBus extends MakeCar {

	@Override
	public void makeHead() {
		System.out.println("BUS组装车头");
	}

	@Override
	public void makeBody() {
		System.out.println("BUS组装车身");
	}

	@Override
	public void makeTail() {
		System.out.println("BUS组装车尾");
	}

}
