package test;
/**
 * ���̶ӵ��ϰ�
 * @author Administrator
 *
 */
public class HouseDirector {
	
	public  House makeHouse(HouseBuilder builder){
		builder.makeFloor();
		builder.makeHouseTop();
		builder.makeWall();
		return builder.getHouse();
	}
	
}
