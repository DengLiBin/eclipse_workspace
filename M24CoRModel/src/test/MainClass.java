package test;
/**
 * ְ����ģʽ������һϵ�зֱ𵣵���ͬ��ְ�����Ķ�������ͬ���һ��������Щ��Ķ���֮��������һ���������������Ա���Ϊְ����ģʽ
 * @author DengLibin
 *
 */
public class MainClass {
	public static void main(String[] args){
		CarHeadHandler head = new CarHeadHandler();
		CarBodyHandler body = new CarBodyHandler();
		CarTailHandler tail = new CarTailHandler();
		/*
		//��װ˳�򣺳�ͷ-->����-->��β
		head.setNextHandler(body);
		body.setNextHandler(tail);
		
		head.HandlerCar();
		*/
		
		//��װ˳�򣺳�β-->����-->��ͷ
		tail.setNextHandler(body);
		body.setNextHandler(head);
		//head.setNextHandler(tail);//������ѭ����ջ����쳣
		tail.HandlerCar();
	}
}
