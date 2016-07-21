package test;

import java.util.Observable;

public class Person extends Observable {
	private String name;
	private String sex;
	private int age;
	
	public Person(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers();
	}
	public String getSex() {
		return sex;
		
	}
	public void setSex(String sex) {
		this.sex = sex;
		this.setChanged();
		this.notifyObservers();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		this.setChanged();//对象发生改变
		this.notifyObservers();//通知观察者
	}
	@Override
	protected synchronized void setChanged() {
		
		super.setChanged();
	}
}
