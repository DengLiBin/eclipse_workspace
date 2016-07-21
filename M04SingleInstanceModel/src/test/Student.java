package test;

public class Student {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Student(){
		
	}
	
	//饿汉式,多线程也能保证单例
	private static Student student=new Student();
	
	public static Student getInstance(){
		return student;
	}
}	
