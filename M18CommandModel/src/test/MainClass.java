package test;
/**
 * ����ģʽ�����������ĳ�������У�һ�����������һ������һ������µĵ��ù����ǣ�����Ŀ�����ʵ��;
 * ���ò���������Ŀ�����ķ�����
 * ��������Щ������б�Ҫʹ��һ��ר�ŵ�������ֵ��ù��̼��Է�װ������ר�ŵ������Command��
 * @author denglibin
 *
 */
public class MainClass {

	public static void main(String[] args) {
		Peddler peddler = new Peddler();
		Command appleCommand = new AppleCommand(peddler);
		//appleCommand.sail();
		Waiter waiter = new Waiter();
		waiter.setCommand(appleCommand);
		waiter.saile();
		
		Command bananaCommand = new BananaCommand(peddler);
		//bananaCommand.sail();
		waiter.setCommand(bananaCommand);
		waiter.saile();
		
	}

}
