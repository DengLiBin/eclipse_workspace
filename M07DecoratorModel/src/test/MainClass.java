package test;
/**
 * װ����ģʽ:��չ����Ĺ��ܣ���װ���������
 * @author Administrator
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Car runcar=new RunCar();
		CarDecorator flycar=new FlyCarDecorator(runcar);//װ�Σ���ӷɵĹ���
		flycar.show();
		
		CarDecorator swimcar=new SwimCarDecorator(flycar);//��һ��װ�Σ�����εĹ���
		swimcar.show();
	}

}
