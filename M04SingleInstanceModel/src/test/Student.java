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
	
	//����ʽ,���߳�Ҳ�ܱ�֤����
	private static Student student=new Student();
	
	public static Student getInstance(){
		return student;
	}
}	
