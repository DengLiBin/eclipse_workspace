package test;
/**
 * �۲���ģʽ����һ�������״̬�����仯ʱ���ܹ��Զ�֪ͨ�������������Զ�ˢ�¶���״̬
 * 
 * @author Administrator
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Person person = new Person("denglibin","��",23);
		//ע��۲��ߣ�����ע����,�ײ�ʵ�ַ�����person������ע��Ĺ۲��߼��뵽һ�������У�person�ı�ʱ����ȡ����Щ�۲��ߣ��������ǵ�update����
		person.addObserver(new MyObServer());
		person.addObserver(new MyObServer());
	//	person.deleteObservers();//ɾ���۲���
		person.setName("lifengxing");
		person.setAge(24);
		
	}

}
