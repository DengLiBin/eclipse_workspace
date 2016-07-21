package test;
/**
 *简单工程模式 
 */
public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{	
		
		//根据类名创建实例
		Apple apple=(Apple) FruitFactory.getFruit(Apple.class.getName());	
		apple.get();
		Banana banana=(Banana) FruitFactory.getFruit(Banana.class.getName());
		banana.get();
	}
}
