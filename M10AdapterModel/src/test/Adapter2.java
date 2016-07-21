package test;
/**
 * 通过持有引用实现Adapter
 * @author Administrator
 *
 */
public class Adapter2 {
	private Current current;
	public Adapter2(Current current){
		this.current=current;
	}
	
	public void use18(){
		System.out.println("使用适配器");
		this.current.use220v();
	}
}
