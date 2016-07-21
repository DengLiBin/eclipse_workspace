package test;
/**
 * 职责链模式：构造一系列分别担当不同的职责的类的对象来共同完成一个任务，这些类的对象之间像链条一样紧密相连，所以被称为职责链模式
 * @author DengLibin
 *
 */
public class MainClass {
	public static void main(String[] args){
		CarHeadHandler head = new CarHeadHandler();
		CarBodyHandler body = new CarBodyHandler();
		CarTailHandler tail = new CarTailHandler();
		/*
		//组装顺序：车头-->车身-->车尾
		head.setNextHandler(body);
		body.setNextHandler(tail);
		
		head.HandlerCar();
		*/
		
		//组装顺序：车尾-->车身-->车头
		tail.setNextHandler(body);
		body.setNextHandler(head);
		//head.setNextHandler(tail);//会无限循环，栈溢出异常
		tail.HandlerCar();
	}
}
