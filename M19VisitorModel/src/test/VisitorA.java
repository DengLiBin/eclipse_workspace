package test;
/**
 * 清洁工B,负责parkB的的部分
 * @author denglibin
 *
 */
public class VisitorA implements Visitor {

	@Override
	public void visit(Park park) {

	}

	@Override
	public void visit(ParkA parkA) {
		System.out.println("清洁工A负责ParkA的卫生");
	}

	@Override
	public void visit(ParkB parkB) {

	}

}
