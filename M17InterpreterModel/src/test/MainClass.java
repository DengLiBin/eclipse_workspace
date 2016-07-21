package test;
/**
 * 解释器模式：它建立一个解释器，对于特定的计算机程序设计语言，用解释预先定义的文法，
 * 简单地说，解释器模式就是一种简单的语法解释器架构。
 * 实际开发中不是很常用
 * @author Administrator
 *
 */
public class MainClass {

	public static void main(String[] args) {
		String num = "10";
		Context context = new Context(num);
		
		Expression expression = new PlusExpression();
		expression.interpret(context);
		
		System.out.println(context.getOutput());
	}

}
