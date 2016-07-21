package test;

public class Person {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//����ʽ�����̲߳��ܱ�֤����,Ҫ��ͬ�����ܱ�֤����
	private static Person person;
	//��̬����
	public static  Person getInstance(){
		//���������������ͬ����ÿ���̴߳������󶼻�������Ч�ʲ���
		
		//˫�ؼ�飬ֻҪperson��=null�Ͳ���������Ч�ʽϸ�
		if(person == null){
			synchronized (Person.class) {
				if(person == null){
					person = new Person();
				}
			}
			person=new Person();
		}
		return person;
	}
	//˽�л����췽��
	private Person(){
		
	}
}
