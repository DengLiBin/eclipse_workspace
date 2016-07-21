package test;

public class Jeep extends Car {

	public Jeep(Engine engine) {
		super(engine);
	}

	@Override
	public void insallEngine() {
		System.out.println("Jeep安装的引擎：");
		this.engine.installEngine();
	}

}
