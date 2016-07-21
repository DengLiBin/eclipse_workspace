package test;

import factory.AppleFactory;
import factory.BananaFactory;
/**
 * 工厂方法模式
 * @author Administrator
 *
 */
public class MainClass {
	public static void main(String[] args) {	
		FruitFactory appleFactory=new AppleFactory();
		Fruit apple=appleFactory.getFruit();
		apple.get();
		
		FruitFactory bananaFactory=new BananaFactory();
		Fruit banana=bananaFactory.getFruit();
		banana.get();
	}
}
