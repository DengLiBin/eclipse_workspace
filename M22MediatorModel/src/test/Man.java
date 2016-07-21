package test;
/**
 * man自己找woman，这样的话Man和Woman的耦合度很高，这样不是很好，引入中介者模式解决这个问题
 * @author DengLibin
 *
 */
public class Man extends Person {

	public Man(String name, int condition) {
		super(name, condition);
		
	}

	@Override
	public void getPartener(Person person) {
		if(person instanceof Man){
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
