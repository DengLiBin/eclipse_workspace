package test;
/**
 * 适配器模式：例如外部输入电压是220v,设备需要的电压是18v,只需添加一个适配器；前期设计不能满足需要，要进行一些修改，通过适配器模式来完成。
 * @author Administrator
 *
 */
public class MainClass {
	public static void main(String[] args){
		/*Adapter adapter=new Adapter();
		adapter.use18v();
		*/
		Adapter2 adapter2=new Adapter2(new Current());
		adapter2.use18();
	}
}
