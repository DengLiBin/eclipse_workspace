package test;

public class Jeep extends Car {

	public Jeep(Engine engine) {
		super(engine);
	}

	@Override
	public void insallEngine() {
		System.out.println("Jeep��װ�����棺");
		this.engine.installEngine();
	}

}
