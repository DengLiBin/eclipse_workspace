package test;

public class MakeBus extends MakeCar {

	@Override
	public void makeHead() {
		System.out.println("BUS��װ��ͷ");
	}

	@Override
	public void makeBody() {
		System.out.println("BUS��װ����");
	}

	@Override
	public void makeTail() {
		System.out.println("BUS��װ��β");
	}

}
