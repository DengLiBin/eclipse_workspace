package test;
/**
 * ����ģʽ����һϵ���㷨���Է�װ��Ϊ�����㷨����һ������Ľӿڣ���ͨ���̳иý�ڶ����е��㷨���Է�װ��ʵ��
 * @author Administrator
 *
 */
public class MainClass {

	public static void main(String[] args) {
		/*
		Strategy MD5 = new MD5Strategy();
		MD5.jiami();
		*/
		
		//��Context����װ��Context����Strategy�����ã�
		Context context = new Context(new MD5Strategy());
		context.jiami();
		
	}	

}
