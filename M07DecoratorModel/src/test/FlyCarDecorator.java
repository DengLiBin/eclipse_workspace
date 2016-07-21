package test;

public class FlyCarDecorator extends CarDecorator {

	public FlyCarDecorator(Car car) {
		super(car);
	}

	@Override
	public void show() {
		this.getCar().show();
		this.fly();
	}
	public void fly(){
		System.out.println("≥µø…“‘∑…");
	}

	@Override
	public void run() {
		
	}
}
