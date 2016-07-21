 package test2;
/**
 * man自己找woman，这样的话Man和Woman的耦合度很高，这样不是很好，引入中介者模式解决这个问题
 * @author DengLibin
 *
 */
public class Man extends Person {

	public Man(String name, int condition,Mediator mediator) {
		super(name, condition,mediator);
		
	}
	//通过中介来找对象
	@Override
	public void getPartener(Person person) {
		this.getMediator().setMan(this);
		this.getMediator().getParenter(person);
	}

}
