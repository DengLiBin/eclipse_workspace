package test;
/**
 * ������ģʽ��������һ���������������ض��ļ��������������ԣ��ý���Ԥ�ȶ�����ķ���
 * �򵥵�˵��������ģʽ����һ�ּ򵥵��﷨�������ܹ���
 * ʵ�ʿ����в��Ǻܳ���
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
