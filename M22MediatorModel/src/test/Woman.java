package test;

public class Woman extends Person {

	public Woman(String name, int condition) {
		super(name, condition);
	}

	@Override
	public void getPartener(Person person) {
		if(person instanceof Woman){
			System.out.println("�����Ҳ���ͬ����");
		}else{
			if(this.getCondition() == person.getCondition()){
				System.out.println(this.getName()+"��"+person.getName()+"����");
			}else{
				System.out.println("������ƥ��");
			}
		}
	}

}
