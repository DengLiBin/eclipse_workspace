package test;

public class VisitorMananger implements Visitor {

	@Override
	public void visit(Park park) {
		System.out.println("管理员：检查公园");
	}

	@Override
	public void visit(ParkA parkA) {
		System.out.println("管理员：检查公园A部分");
	}

	@Override
	public void visit(ParkB parkB) {
		System.out.println("管理员：检查公园B部分");
	}

}
