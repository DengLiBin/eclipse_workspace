package test;

public class Person {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//懒汉式：多线程不能保证单例,要加同步才能保证单例
	private static Person person;
	//静态方法
	public static  Person getInstance(){
		//如果将整个方法都同步，每个线程创建对象都会阻塞，效率不高
		
		//双重检查，只要person！=null就不会阻塞，效率较高
		if(person == null){
			synchronized (Person.class) {
				if(person == null){
					person = new Person();
				}
			}
			person=new Person();
		}
		return person;
	}
	//私有化构造方法
	private Person(){
		
	}
}
