package test;

public class PlusExpression extends Expression {

	@Override
	public void interpret(Context context) {
		System.out.println("�Զ�����");
		
		//��������Ļ���
		String input = context.getInput();
		//��������װ��
		int intInput = Integer.parseInt(input);
		//���е���
		intInput++;
		//�����������½��и�ֵ
		context.setInput(String.valueOf(intInput));
		context.setOutput(intInput);
	}

}
