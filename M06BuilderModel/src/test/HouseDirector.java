package test;
/**
 * 工程队的老板
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
