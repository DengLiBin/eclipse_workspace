package test;

public class CarTailHandler extends CarHandler {

	@Override
	public void HandlerCar() {
		System.out.println("��װ��β");
		if(this.nextCarHandler != null){
			this.nextCarHandler.HandlerCar();
		}
	}

}
