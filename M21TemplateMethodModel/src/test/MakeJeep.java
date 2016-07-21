package test;

public class MakeJeep extends MakeCar {

	@Override
	public void makeHead() {
		System.out.println("Jeep组装车头");
	}

	@Override
	public void makeBody() {
		System.out.println("Jeep组装车身");
	}

	@Override
	public void makeTail() {
		System.out.println("Jeep组装车尾");
	}
	
	public void make(){
		MakeJeep.this.makeHead();
		MakeJeep.this.makeBody();
		MakeJeep.this.makeTail();
	}
}
