package test;
/**
 * ������ģʽ�������ⲿ�����ѹ��220v,�豸��Ҫ�ĵ�ѹ��18v,ֻ�����һ����������ǰ����Ʋ���������Ҫ��Ҫ����һЩ�޸ģ�ͨ��������ģʽ����ɡ�
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
