package test;
/**
 * 装饰器，给car添加额外功能
 * @author Administrator
 *
 */
public abstract class CarDecorator implements Car{
	private Car car;
	public Car getCar() {
		return car;
	}
	public CarDecorator(Car car){
		this.car=car;
	}
	public abstract void show();
}
