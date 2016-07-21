package test;

import java.util.ArrayList;
import java.util.List;

/*
 * 实现Cloneable接口，表示该类的对象是可以克隆的
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
			//return (Person)super.clone();//friends克隆的只是集合的引用——浅克隆，源对象和目标对象中的friends指向的是同一个集合
			
			Person person = (Person)super.clone();
			//为新克隆的对象重新设置一个friends集合——深克隆
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
