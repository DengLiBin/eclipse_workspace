package myuse.test;

import org.junit.Test;

import myuse.myenum.AbstractEnum;
import myuse.myenum.Direction;

public class TestEnum {
	@Test
	public void testEnum(){
		System.out.println(Direction.E.name()+"---"+Direction.E.ordinal());//E---0,λ�ã���0��ʼ
		Direction.E.print();
		/*
		String str = "K";
		Direction dir = Direction.E.valueOf(Direction.class, str);//���ַ���ת����ö��
		System.out.println(dir);//���Բ�ͨ����û��K���ö��,�÷����������ж��û��ύ�������Ƿ���ָ��������
		
		*/
		Direction[] dirs = Direction.values();//��ȡ����ö��ֵ
		for(Direction d : dirs){
			System.out.print(d+"==");
			d.print();
		}
		
	}
	//���Դ����󷽷���ö��
	@Test
	public void testAbstractEnum(){
		String string = AbstractEnum.A.localValue();
		System.out.println(string);
	}
}