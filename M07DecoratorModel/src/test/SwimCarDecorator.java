package test;

public class SwimCarDecorator extends CarDecorator {

	public SwimCarDecorator(Car car) {
		super(car);
	}

	@Override
	public void run() {
		
	}

	@Override
	public void show() {
		this.getCar().show();
		this.swim();
		
	}
	public void swim(){
		System.out.println("车可以游");
	}
}
