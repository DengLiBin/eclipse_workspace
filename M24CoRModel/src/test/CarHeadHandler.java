package test;

public class CarHeadHandler extends CarHandler {

	@Override
	public void HandlerCar() {
		System.out.println("��װ��ͷ");
		if(this.nextCarHandler != null){
			this.nextCarHandler.HandlerCar();
		}
	}

}
