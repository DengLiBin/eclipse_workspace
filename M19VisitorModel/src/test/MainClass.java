package test;
/**
 * ������ģʽ
 * @author denglibin
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Park park = new Park();
		VisitorA visitorA = new VisitorA();
		park.accept(visitorA);//����a��a��ֻ��a�Ĺ���
		
		VisitorB visitorB = new VisitorB();
		park.accept(visitorB);//����b��b����b�Ĺ���
		
		VisitorMananger mananger = new VisitorMananger();
		park.accept(mananger);
		
	}

}
