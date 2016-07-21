package test;
/**
 * 装饰器模式:扩展对象的功能，用装饰器来完成
 * @author Administrator
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Car runcar=new RunCar();
		CarDecorator flycar=new FlyCarDecorator(runcar);//装饰，添加飞的功能
		flycar.show();
		
		CarDecorator swimcar=new SwimCarDecorator(flycar);//再一次装饰，添加游的功能
		swimcar.show();
	}

}
