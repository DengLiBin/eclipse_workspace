package test;
/**
 * ��๤B,����parkB�ĵĲ���
 * @author denglibin
 *
 */
public class VisitorA implements Visitor {

	@Override
	public void visit(Park park) {

	}

	@Override
	public void visit(ParkA parkA) {
		System.out.println("��๤A����ParkA������");
	}

	@Override
	public void visit(ParkB parkB) {

	}

}
