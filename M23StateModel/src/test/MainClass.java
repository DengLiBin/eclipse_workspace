package test;
/**
 * ״̬ģʽ��ͨ���ı������ڲ�״̬���ı�������Ϊ�����������ֵľͺ����޸���������һ��
 * @author DengLibin
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Person person = new Person(7);
		
		person.doSomething();
		
		person.setHour(12);
		person.doSomething();
		
		person.setHour(18);
		person.doSomething();
		
		person.setHour(12);
		person.doSomething();
		
	}

}
