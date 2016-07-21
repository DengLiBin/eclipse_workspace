package test;
/**
 * 建造者模式：创建对象
 * 创建的是一个复合睇相：被创建的对象为一个具有复合属性的复合对象
 * 关注对象的各部分的创建过程：不同的工厂（这里值builder生成器）对产品属性有不同的创建方法
 */
public class MainClass {

	public static void main(String[] args) {
		
		//客户直接建造房子
		/*
		House house=new House();
		house.setFloor("地板");
		house.setWall("墙");
		house.setHouseTop("屋顶");
		*/
		//由工程队来修
		
		/*
		HouseBuilder builder=new PingFangBuilder();
		builder.makeFloor();
		builder.makeHouseTop();
		builder.makeWall();
		House house=builder.getHouse();
		*/
		
		//把工程交给工程老板，让他来修
		HouseDirector director=new HouseDirector();
		
		//修平房
		House pingfang=director.makeHouse(new PingFangBuilder());
		System.out.println(pingfang.getFloor());
		System.out.println(pingfang.getWall());
		System.out.println(pingfang.getHouseTop());
		
		//修公寓
		House gongyu=director.makeHouse(new GongYuBuilder());
		System.out.println(gongyu.getFloor());
		System.out.println(gongyu.getWall());
		System.out.println(gongyu.getHouseTop());
	}

}
