package test;

public class MakeJeep extends MakeCar {

	@Override
	public void makeHead() {
		System.out.println("Jeep��װ��ͷ");
	}

	@Override
	public void makeBody() {
		System.out.println("Jeep��װ����");
	}

	@Override
	public void makeTail() {
		System.out.println("Jeep��װ��β");
	}
	
	public void make(){
		MakeJeep.this.makeHead();
		MakeJeep.this.makeBody();
		MakeJeep.this.makeTail();
	}
}
