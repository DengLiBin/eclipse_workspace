package test;
/**
 * �Ž�ģʽ�����������С���ԭ��ͨ����װ���ۺ��Լ��̳е���Ϊ���ò�ͬ����е���ͬ�����Σ�������Ҫ�ص���ǰѳ�������Ϊʵ�ַ��뿪���Ӷ�
 * ���Ա��ָ����ֵĶ������Լ�Ӧ�����ǵĹ�����չ
 * @author Administrator
 *
 */
public class MainClass {
	public static void main(String[] args){
		
		//Car����Engine�����ã��൱����һ���Ű�Car��Engine��ϵ����
		Car bus=new Bus(new Engine2000());
		bus.insallEngine();
		
		Car jeep=new Jeep(new Engine2200());
		jeep.insallEngine();
	}
}
