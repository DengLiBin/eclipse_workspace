package test;
/**
 * ��๤A,����parkA�ĵĲ���
 * @author denglibin
 *
 */
public class VisitorB implements Visitor {

	@Override
	public void visit(Park park) {

	}

	@Override
	public void visit(ParkA parkA) {
		
	}

	@Override
	public void visit(ParkB parkB) {
		System.out.println("��๤B����ParkB������");
	}

}
