 package test2;
/**
 * man�Լ���woman�������Ļ�Man��Woman����϶Ⱥܸߣ��������Ǻܺã������н���ģʽ����������
 * @author DengLibin
 *
 */
public class Man extends Person {

	public Man(String name, int condition,Mediator mediator) {
		super(name, condition,mediator);
		
	}
	//ͨ���н����Ҷ���
	@Override
	public void getPartener(Person person) {
		this.getMediator().setMan(this);
		this.getMediator().getParenter(person);
	}

}
