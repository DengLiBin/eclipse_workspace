package test;
/**
 * ����ģʽ��������Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ���
 * @author Administrator
 *
 */
public class MainClass {
	public static void main(String[] args){
		
		//ͨ������������
		Subject proxySubject=new ProxySubject(new RealSubject());
		proxySubject.saleBook();
		
	}
}
