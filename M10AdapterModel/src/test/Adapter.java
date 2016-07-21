package test;
/**
 *通过继承实现Adapter 
 */
public class Adapter extends Current{
	public void use18v(){
		System.out.println("使用适配器");
		this.use220v();
	}
}
