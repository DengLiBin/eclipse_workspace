package test;

public class CarBodyHandler extends CarHandler {

	@Override
	public void HandlerCar() {
		System.out.println("组装车身");
		if(this.nextCarHandler != null){
			this.nextCarHandler.HandlerCar();
		}
	}

}
