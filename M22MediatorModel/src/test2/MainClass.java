package test2;
/**
 * �н���ģʽ����֮��Ľ�����Ϊ��ͳһ����Mediator�Ķ����У�����ͨ��Mediator����ͬ�������󽻻���Mediator�������ſ�����������
 * @author DengLibin
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		Person zhangsan = new Man("����",7,mediator);
		
		Person lisi = new Man("����",8,mediator);
		
		Person xiaofang = new Woman("С��",7,mediator);
		
		zhangsan.getPartener(lisi);
		zhangsan.getPartener(xiaofang);
	}

}
