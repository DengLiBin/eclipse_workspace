package test;
/**
 * ͨ����������ʵ��Adapter
 * @author Administrator
 *
 */
public class Adapter2 {
	private Current current;
	public Adapter2(Current current){
		this.current=current;
	}
	
	public void use18(){
		System.out.println("ʹ��������");
		this.current.use220v();
	}
}
