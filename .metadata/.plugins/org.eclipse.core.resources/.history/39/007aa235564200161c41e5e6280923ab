package test;
/*
 * 简单工厂模式属于类的创建型模式，又叫静态工厂方法模式，专门定义要给类来负责创建其他类的实例，创建的实例通常都具有
 * 共同的父类
 * 
 * 包含的角色：工厂，抽象接口，具体产品（实例对象）
 * */
public class FruitFactory {
	/*
	
	 * 获取Apple实例
	 
	public static Apple getAppleInstance(){
		return new Apple();
	}
	
	 * 获取Banana实例
	 
	public static Banana getBananaInstance(){
		return new Banana();
	}
	
	*/
	
	
	/*
	 *get方法，获取所有产品对象 
	 *type:类名
	 */
	public static Fruit getFruit(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class<?> fruit=Class.forName(type);
		System.out.println(type);
		return (Fruit)fruit.newInstance();
	}
}
