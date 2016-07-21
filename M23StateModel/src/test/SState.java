package test;

public class SState extends State {

	@Override
	public void doSomething(Person person) {
		if(person.getHour() == 18){
			System.out.println("≥‘ÕÌ∑π");
		}else{
			System.out.println("Œ¥∂®“Â");
		}
		
	}

}
