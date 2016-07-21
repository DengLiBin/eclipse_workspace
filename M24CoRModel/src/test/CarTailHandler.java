package test;

public class CarTailHandler extends CarHandler {

	@Override
	public void HandlerCar() {
		System.out.println("×é×°³µÎ²");
		if(this.nextCarHandler != null){
			this.nextCarHandler.HandlerCar();
		}
	}

}
