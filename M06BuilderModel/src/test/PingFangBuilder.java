package test;
//��ƽ��
public class PingFangBuilder implements HouseBuilder {
	House house=new House();
	@Override
	public void makeFloor() {
		house.setFloor("ƽ��---�ذ�");
	}

	@Override
	public void makeWall() {
		house.setWall("ƽ��---ǽ");
	}

	@Override
	public void makeHouseTop() {
		house.setHouseTop("ƽ��--�ݶ�");
	}

	@Override
	public House getHouse() {
		
		return house;
	}

}
