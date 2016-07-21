package test;

public abstract class Person extends Object{
	private String name;
	private int condition;
	
	public Person(String name, int condition) {
		
		this.name = name;
		this.condition = condition;
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
