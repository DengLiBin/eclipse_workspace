package test2;

public abstract class Person extends Object{
	private String name;
	private int condition;
	private Mediator mediator;
	public Person(String name, int condition,Mediator mediator) {
		this.mediator = mediator;
		this.name = name;
		this.condition = condition;
	}
	
	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCondition() {
		return condition;
	}
	public void setCondition(int condition) {
		this.condition = condition;
	}
	
	public abstract void getPartener(Person person);
}	
