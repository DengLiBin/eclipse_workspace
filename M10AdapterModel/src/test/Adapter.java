package test;
/**
 *ͨ���̳�ʵ��Adapter 
 */
public class Adapter extends Current{
	public void use18v(){
		System.out.println("ʹ��������");
		this.use220v();
	}
}
