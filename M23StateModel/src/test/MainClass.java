package test;
/**
 * 状态模式：通过改变对象的内部状态而改变对象的行为，这个对象表现的就好像修改了它的类一样
 * @author DengLibin
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Person person = new Person(7);
		
		person.doSomething();
		
		person.setHour(12);
		person.doSomething();
		
		person.setHour(18);
		person.doSomething();
		
		person.setHour(12);
		person.doSomething();
		
	}

}
