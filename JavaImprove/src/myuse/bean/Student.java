package myuse.bean;

import java.util.Date;

public class Student {
	private String name;//�ֶ�
	private int age;//�ֶ�
	private int id;//�ֶ�
	private Date birthday;
	//ֻ���ֶζ����ṩ��get()����set()����ʱ�����ֶβų�Ϊ����
	//���Բ������ֶξ����Ķ�����get����set����������
	
	
	
	public Date getBirthday() {
		return birthday;
	}



	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	//abҲ�Ǹ�bean�����ԣ�����û������ֶΣ�
	public int getAb(){
		return 2;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
}