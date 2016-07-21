package test;
/**
 * 代理模式：它可以为其他对象提供一种代理以控制对这个对象的访问
 * @author Administrator
 *
 */
public class MainClass {
	public static void main(String[] args){
		
		//通过代理来卖书
		Subject proxySubject=new ProxySubject(new RealSubject());
		proxySubject.saleBook();
		
	}
}
