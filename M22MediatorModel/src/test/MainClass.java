package test;
/**
 * �н���ģʽ����֮��Ľ�����Ϊ��ͳһ����Mediator�Ķ����У�����ͨ��Mediator����ͬ�������󽻻���Mediator�������ſ�����������
 * @author DengLibin
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Person zhangsan = new Man("����",6);
		Person xiaofang = new Woman("С��",7);
		
		Person lisi = new Man("����",7);
		
		zhangsan.getPartener(xiaofang);
		zhangsan.getPartener(lisi);
		lisi.getPartener(xiaofang);
	}

}
