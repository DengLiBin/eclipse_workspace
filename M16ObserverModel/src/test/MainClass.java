package test;
/**
 * 观察者模式：当一个对象的状态发生变化时，能够自动通知其他关联对象，自动刷新对象状态
 * 
 * @author Administrator
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Person person = new Person("denglibin","男",23);
		//注册观察者，可以注册多个,底层实现方法：person对象会把注册的观察者加入到一个容器中，person改变时，就取出这些观察者，调用它们的update方法
		person.addObserver(new MyObServer());
		person.addObserver(new MyObServer());
	//	person.deleteObservers();//删除观察者
		person.setName("lifengxing");
		person.setAge(24);
		
	}

}
