package myuse.domain;

public final class Person {
	public static int id;
	private int age;
	public String name ;
	public Person(){
		
	}
	private Person(int age){
		this.age = age;
	}
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Person(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge(){
		return age;
	}
	
	public void changeData(int newAge,String newName){
		this.age = newAge;
		this.name = newName;
		System.out.println("��Ϣ�Ѿ��޸ģ�name = "+this.name+"age ="+this.age);
	}
	
	public Class[] aa1(String name,int[] password){
		return new Class[]{String.class};
	}
	public void aa1(){
		System.out.println("������aa1()����");
	}
	private static void aa1(int num){
		System.out.println("num="+num);
	}
	
	public static void main(String[] args){
		System.out.println("main ����"+args[0]);
	}
}