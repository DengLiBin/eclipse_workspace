package test;
/**
 * 外观模式:将 多个类的功能封装到一个类中，其他类都通过该类来实现这些功能
 * @author Administrator
 *
 */
public class MainClass {
	public static void main(String[] args){
		Facade facade=new Facade();
		/*
		facade.saDosomething();
		
		facade.sbDosomething();
		*/
		facade.saAndSbAndScDosomething();
	}
}
