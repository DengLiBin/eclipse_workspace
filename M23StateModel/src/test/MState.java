package test;

public class MState extends State {

	@Override
	public void doSomething(Person person) {
		if(person.getHour() == 7){
			System.out.println("���緹");
		}else{
			person.setState(new LState());
			person.doSomething();
		}
		
	}

}
