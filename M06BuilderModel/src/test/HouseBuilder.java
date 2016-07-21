package test;

public interface HouseBuilder {
	//修地板
	public void makeFloor();
	//修墙
	public void makeWall();
	//修屋顶
	public void makeHouseTop();
	//房子修好了要交房
	public House getHouse();
}
