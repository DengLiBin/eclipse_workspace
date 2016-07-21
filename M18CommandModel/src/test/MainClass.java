package test;
/**
 * 命令模式：在面向对象的程序设计中，一个对象调用另一个对象，一般情况下的调用过程是：创建目标对象实例;
 * 设置参数，调用目标对象的方法。
 * 但是在有些情况下有必要使用一个专门的类对这种调用过程加以封装，这种专门的类称作Command类
 * @author denglibin
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Peddler peddler = new Peddler();
		Command appleCommand = new AppleCommand(peddler);
		//appleCommand.sail();
		Waiter waiter = new Waiter();
		waiter.setCommand(appleCommand);
		waiter.saile();
		
		Command bananaCommand = new BananaCommand(peddler);
		//bananaCommand.sail();
		waiter.setCommand(bananaCommand);
		waiter.saile();
		
	}

}
