package test;

public class PlusExpression extends Expression {

	@Override
	public void interpret(Context context) {
		System.out.println("自动递增");
		
		//获得上下文环境
		String input = context.getInput();
		//进行类型装换
		int intInput = Integer.parseInt(input);
		//进行递增
		intInput++;
		//对上下文重新进行赋值
		context.setInput(String.valueOf(intInput));
		context.setOutput(intInput);
	}

}
