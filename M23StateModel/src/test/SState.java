package test;

public class SState extends State {

	@Override
	public void doSomething(Person person) {
		if(person.getHour() == 18){
			System.out.println("����");
		}else{
			System.out.println("δ����");
		}
		
	}

}
