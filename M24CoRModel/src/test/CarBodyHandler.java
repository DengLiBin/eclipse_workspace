package test;

public class CarBodyHandler extends CarHandler {

	@Override
	public void HandlerCar() {
		System.out.println("��װ����");
		if(this.nextCarHandler != null){
			this.nextCarHandler.HandlerCar();
		}
	}

}
