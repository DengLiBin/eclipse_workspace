package test;

public class VisitorMananger implements Visitor {

	@Override
	public void visit(Park park) {
		System.out.println("����Ա����鹫԰");
	}

	@Override
	public void visit(ParkA parkA) {
		System.out.println("����Ա����鹫԰A����");
	}

	@Override
	public void visit(ParkB parkB) {
		System.out.println("����Ա����鹫԰B����");
	}

}
