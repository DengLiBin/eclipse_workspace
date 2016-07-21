package test2;
/**
 * 中介者模式：类之间的交互行为被统一放在Mediator的对象中，对象通过Mediator对象同其他对象交互，Mediator对象起着控制器的作用
 * @author DengLibin
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		Person zhangsan = new Man("张三",7,mediator);
		
		Person lisi = new Man("李四",8,mediator);
		
		Person xiaofang = new Woman("小芳",7,mediator);
		
		zhangsan.getPartener(lisi);
		zhangsan.getPartener(xiaofang);
	}

}
