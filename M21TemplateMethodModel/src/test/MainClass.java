package test;
/**
 * ģ�巽��ģʽ�����Ѿ����ض������㷨�е�ĳЩ��Ҫ�Ĵ���ί�ø����󷽷���ͨ������̳жԳ��󷽷��Ĳ�ͬʵ�ָı������㷨����Ϊ
 * @author DengLibin
 *
 */
public class MainClass {

	public static void main(String[] args) {
		
		MakeCar bus = new MakeBus();
		bus.makeHead();
		bus.makeBody();
		bus.makeTail();
		
		MakeJeep jeep = new MakeJeep();
		jeep.make();
	}

}
