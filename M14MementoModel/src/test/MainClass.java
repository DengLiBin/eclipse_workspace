package test;
/**
 * ����¼ģʽ����һ������
 * Ӧ�ó��������һ��������Ҫ����״̬����ͨ��undo����rollback�����ָ�����ǰ��״̬ʱ
 * @author Administrator
 *
 */
public class MainClass {
	public static void main(String[] args){
		Person person = new Person("dengiubin","��",23);
		//����
		Memento memento = person.createMemento();
		//�޸�����
		person.setAge(12);
		person.setName("dagaga");
		person.setSex("Ů");
		person.display();
		
		//��ԭ
		person.setMemento(memento);
		
		person.display();
	/*	
		Person backup = new Person();
		backup.setName(person.getName());
		backup.setAge(person.getAge());
		backup.setSex(person.getSex());
		
		person.display();
		
		//�޸�
		person.setAge(20);
		person.display();
		//��ԭ���ع�
		person.setName(backup.getName());	
		person.setSex(backup.getSex());
		person.setAge(backup.getAge());
	
		person.display();	
		
		*/
	}
}
