package test;
/**
 *ͨ������������ 
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
		System.out.println("��������");
	}
	public void give(){
		System.out.println("���ʹ���ȯ");
	}
}
