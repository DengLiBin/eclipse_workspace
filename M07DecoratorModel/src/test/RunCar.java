package test;

public class RunCar implements Car {

	@Override
	public void run() {
		System.out.println("��������");
	}

	@Override
	public void show() {
		this.run();
	}

}
