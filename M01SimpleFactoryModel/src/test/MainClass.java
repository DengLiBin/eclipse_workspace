package test;
/**
 *�򵥹���ģʽ 
 */
public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{	
		
		//������������ʵ��
		Apple apple=(Apple) FruitFactory.getFruit(Apple.class.getName());	
		apple.get();
		Banana banana=(Banana) FruitFactory.getFruit(Banana.class.getName());
		banana.get();
	}
}