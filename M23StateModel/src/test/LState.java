package test;

public class LState extends State{

	@Override
	public void doSomething(Person person) {
		if(person.getHour() == 12){
			System.out.println("���з�");
		}else{
			person.setState(new SState());
			person.doSomething();
		}
		
	}

}
