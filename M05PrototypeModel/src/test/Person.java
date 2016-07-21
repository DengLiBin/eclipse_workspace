package test;

import java.util.ArrayList;
import java.util.List;

/*
 * ʵ��Cloneable�ӿڣ���ʾ����Ķ����ǿ��Կ�¡��
 **/
public class Person implements Cloneable{
	private String name;
	private int age;
	private List<String> friends;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
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
	public Person clone(){
		try {
			//return (Person)super.clone();//friends��¡��ֻ�Ǽ��ϵ����á���ǳ��¡��Դ�����Ŀ������е�friendsָ�����ͬһ������
			
			Person person = (Person)super.clone();
			//Ϊ�¿�¡�Ķ�����������һ��friends���ϡ������¡
			List<String> friends = new ArrayList<String>();
			for(String friend : this.getFriends()){
				friends.add(friend);
			}
			person.setFriends(friends);
			return person;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
			
		}
	}
}
