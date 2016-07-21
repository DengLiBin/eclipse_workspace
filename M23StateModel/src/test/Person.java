package test;

public class Person {
	private int hour;
	State state ;
	
	
	public Person(int hour) {
		super();
		state = new MState();
		this.hour = hour;
		
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void doSomething(){
		
		state.doSomething(this);
		state = new MState();//×´Ì¬ÖØÖÃ
	}
}
