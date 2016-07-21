package test;
/**
 *通过代理来卖书 
 */
public class ProxySubject implements Subject {
	private RealSubject realSubject;
	public ProxySubject(RealSubject realSubject){
		this.realSubject=realSubject;
	}
	@Override
	public void saleBook() {
		realSubject.saleBook();
		this.dazhe();
		this.give();
	}
	public void dazhe(){
		System.out.println("打折卖书");
	}
	public void give(){
		System.out.println("赠送代金券");
	}
}
