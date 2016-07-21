package test;

public class Bus extends Car {

	public Bus(Engine engine) {
		super(engine);
	}

	@Override
	public void insallEngine() {
		System.out.println("bus安装的引擎：");
		this.engine.installEngine();
	}

}
