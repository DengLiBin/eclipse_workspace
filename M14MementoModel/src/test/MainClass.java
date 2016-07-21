package test;
/**
 * 备忘录模式：做一个备份
 * 应用场景：如果一个对象需要保存状态并可通过undo或者rollback操作恢复到以前的状态时
 * @author Administrator
 *
 */
public class MainClass {
	public static void main(String[] args){
		Person person = new Person("dengiubin","男",23);
		//备份
		Memento memento = person.createMemento();
		//修改属性
		person.setAge(12);
		person.setName("dagaga");
		person.setSex("女");
		person.display();
		
		//还原
		person.setMemento(memento);
		
		person.display();
	/*	
		Person backup = new Person();
		backup.setName(person.getName());
		backup.setAge(person.getAge());
		backup.setSex(person.getSex());
		
		person.display();
		
		//修改
		person.setAge(20);
		person.display();
		//还原，回滚
		person.setName(backup.getName());	
		person.setSex(backup.getSex());
		person.setAge(backup.getAge());
	
		person.display();	
		
		*/
	}
}
