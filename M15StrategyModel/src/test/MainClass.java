package test;
/**
 * 策略模式：对一系列算法加以封装，为所有算法定义一个抽象的接口，并通过继承该借口对所有的算法加以封装和实现
 * @author Administrator
 *
 */
public class MainClass {

	public static void main(String[] args) {
		/*
		Strategy MD5 = new MD5Strategy();
		MD5.jiami();
		*/
		
		//用Context来封装（Context持有Strategy的引用）
		Context context = new Context(new MD5Strategy());
		context.jiami();
		
	}	

}
