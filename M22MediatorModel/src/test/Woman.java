package test;

public class Woman extends Person {

	public Woman(String name, int condition) {
		super(name, condition);
	}

	@Override
	public void getPartener(Person person) {
		if(person instanceof Woman){
			System.out.println("汗，我不是同性恋");
		}else{
			if(this.getCondition() == person.getCondition()){
				System.out.println(this.getName()+"和"+person.getName()+"绝配");
			}else{
				System.out.println("条件不匹配");
			}
		}
	}

}
