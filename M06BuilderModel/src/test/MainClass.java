package test;
/**
 * ������ģʽ����������
 * ��������һ���������ࣺ�������Ķ���Ϊһ�����и������Եĸ��϶���
 * ��ע����ĸ����ֵĴ������̣���ͬ�Ĺ���������ֵbuilder���������Բ�Ʒ�����в�ͬ�Ĵ�������
 */
public class MainClass {

	public static void main(String[] args) {
		
		//�ͻ�ֱ�ӽ��췿��
		/*
		House house=new House();
		house.setFloor("�ذ�");
		house.setWall("ǽ");
		house.setHouseTop("�ݶ�");
		*/
		//�ɹ��̶�����
		
		/*
		HouseBuilder builder=new PingFangBuilder();
		builder.makeFloor();
		builder.makeHouseTop();
		builder.makeWall();
		House house=builder.getHouse();
		*/
		
		//�ѹ��̽��������ϰ壬��������
		HouseDirector director=new HouseDirector();
		
		//��ƽ��
		House pingfang=director.makeHouse(new PingFangBuilder());
		System.out.println(pingfang.getFloor());
		System.out.println(pingfang.getWall());
		System.out.println(pingfang.getHouseTop());
		
		//�޹�Ԣ
		House gongyu=director.makeHouse(new GongYuBuilder());
		System.out.println(gongyu.getFloor());
		System.out.println(gongyu.getWall());
		System.out.println(gongyu.getHouseTop());
	}

}
