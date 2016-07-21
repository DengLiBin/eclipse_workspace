package test;

public class Person {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String name;
	private String sex;
	private int age;
	public Person(){
		
	}
	public Person(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public void display(){
		System.out.println(this.name+","+this.sex+","+this.age);
	}
	
	//创建备份
	public Memento createMemento(){
		return new Memento(this.name,this.sex,this.age);
	}
	//恢复备份，还原
	public void setMemento(Memento memento){
		this.name = memento.getName();
		this.age = memento.getAge();
		this.sex = memento.getSex();
	}
}
