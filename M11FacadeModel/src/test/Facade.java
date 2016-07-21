package test;
/*
 * 将A,B,C子系统的功能全放到这里来
 */
public class Facade {
	private SystemA sa;
	private SystemB sb;
	private SystemC sc;
	public Facade(){
		sa=new SystemA();
		sb=new SystemB();
		sc=new SystemC();
	}
	public void saDosomething(){
		sa.dosomething();
	}
	public void sbDosomething(){
		sb.dosomething();
	}
	
	public void scDosomething(){
		sc.dosomething();
	}
	public void saAndSbDosomething(){
		sa.dosomething();
		sb.dosomething();
	}
	public void saAndScDosomething(){
		sa.dosomething();
		sc.dosomething();
	}
	public void sbAndScDosomething(){
		sc.dosomething();
		sb.dosomething();
	}
	public void saAndSbAndScDosomething(){
		sa.dosomething();
		sb.dosomething();
		sc.dosomething();
	}
}
