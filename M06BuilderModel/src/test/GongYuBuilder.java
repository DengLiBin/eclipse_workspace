package test;
//��ƽ��
public class GongYuBuilder implements HouseBuilder {
	House house=new House();
	@Override
	public void makeFloor() {
		house.setFloor("��Ԣ---�ذ�");
	}

	@Override
	public void makeWall() {
		house.setWall("��Ԣ---ǽ");
	}

	@Override
	public void makeHouseTop() {
		house.setHouseTop("��Ԣ--�ݶ�");
	}

	@Override
	public House getHouse() {
		
		return house;
	}

}
