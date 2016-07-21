package test;
/**
 * 访问者模式
 * @author denglibin
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Park park = new Park();
		VisitorA visitorA = new VisitorA();
		park.accept(visitorA);//接收a，a就只做a的工作
		
		VisitorB visitorB = new VisitorB();
		park.accept(visitorB);//接收b，b就做b的工作
		
		VisitorMananger mananger = new VisitorMananger();
		park.accept(mananger);
		
	}

}
