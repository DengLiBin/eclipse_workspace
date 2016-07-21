package test;
/**
 * 模板方法模式：它把具有特定步骤算法中的某些必要的处理委让给抽象方法，通过子类继承对抽象方法的不同实现改变整个算法的行为
 * @author DengLibin
 *
 */
public class MainClass {

	public static void main(String[] args) {
		
		MakeCar bus = new MakeBus();
		bus.makeHead();
		bus.makeBody();
		bus.makeTail();
		
		MakeJeep jeep = new MakeJeep();
		jeep.make();
	}

}
