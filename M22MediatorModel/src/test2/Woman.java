package test2;

public class Woman extends Person {

	public Woman(String name, int condition,Mediator mediator) {
		super(name, condition, mediator);
	}

	@Override
	public void getPartener(Person person) {
		this.getMediator().setWoman(this);
		this.getMediator().getParenter(person);
	}

}
