package test;
/**
 * man�Լ���woman�������Ļ�Man��Woman����϶Ⱥܸߣ��������Ǻܺã������н���ģʽ����������
 * @author DengLibin
 *
 */
public class Man extends Person {

	public Man(String name, int condition) {
		super(name, condition);
		
	}

	@Override
	public void getPartener(Person person) {
		if(person instanceof Man){
			System.out.println("�����Ҳ���ͬ����");
		}else{
			if(this.getCondition() == person.getCondition()){
				System.out.println(this.getName()+"��"+person.getName()+"����");
			}else{
				System.out.println("������ƥ��");
			}
		}
	}

}
