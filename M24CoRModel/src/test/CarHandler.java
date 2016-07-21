package test;

public abstract class CarHandler {
	protected CarHandler nextCarHandler;
	public void setNextHandler(CarHandler carHandler){
		this.nextCarHandler = carHandler;
	}
	public abstract void HandlerCar();
}
