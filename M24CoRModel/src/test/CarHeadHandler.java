package test;

public class CarHeadHandler extends CarHandler {

	@Override
	public void HandlerCar() {
		System.out.println("组装车头");
		if(this.nextCarHandler != null){
			this.nextCarHandler.HandlerCar();
		}
	}

}
