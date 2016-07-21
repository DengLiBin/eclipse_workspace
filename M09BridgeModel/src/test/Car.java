package test;

public abstract class Car {
	public  Engine engine;
	public Car(Engine engine){
		this.engine=engine;
	}
	
	public abstract void insallEngine();
}
