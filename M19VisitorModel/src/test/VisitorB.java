package test;
/**
 * 清洁工A,负责parkA的的部分
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
		System.out.println("清洁工B负责ParkB的卫生");
	}

}
