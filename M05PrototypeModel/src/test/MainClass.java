package test;

import java.util.ArrayList;
import java.util.List;

/**
 * ԭ��ģʽ����ԭ�Ͷ���������Ŀ�����Ҳ����˵�����󴴽���һ��������ԭ�Ͷ�����Ŀ�����ԭ�Ͷ��������ͬ�Ľṹ������
 * 
 * Ӧ�ó������¶�����Ҫ�̳�ԭ�Ͷ��������
 * 
 * ���¡��Ŀ������Դ������Ի���Ӱ��
 * @author Administrator
 *
 */
public class MainClass {

	public static void main(String[] args) {
		/*
		Person person=new Person();//ԭ�Ͷ���
		person.setAge(10);
		person.setName("����");
		
		Person person2=person.clone();//Ŀ�����
		person2.setName("����");
		
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
