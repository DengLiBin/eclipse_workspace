package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式：由原型对象自身创建目标对象，也就是说，对象创建这一动作发自原型对象本身，目标对象原型对象具有相同的结构和数据
 * 
 * 应用场景：新对象需要继承原型对象的数据
 * 
 * 深克隆：目标对象和源对象可以互不影响
 * @author Administrator
 *
 */
public class MainClass {

	public static void main(String[] args) {
		/*
		Person person=new Person();//原型对象
		person.setAge(10);
		person.setName("北风");
		
		Person person2=person.clone();//目标对象
		person2.setName("东方");
		
		System.out.println(person.getName());
		System.out.println(person2.getName());
		
		*/
		Person person3=new Person();
		List<String> friends=new ArrayList<String>();
		friends.add("James");
		friends.add("YaoMing");
		person3.setFriends(friends);
		
		Person person4=person3.clone();
		friends.add("Mike");
		System.out.println(person3.getFriends());
		System.out.println(person4.getFriends());
		
	}

}
