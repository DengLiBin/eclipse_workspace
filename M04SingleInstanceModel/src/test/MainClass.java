package test;

/*����ģʽ��
 * ΪʲôҪʹ�õ���ģʽ��
 * 1������߳�֮��,����servlet����������ͬһ����Դ���߲���ͬһ������
 * 2������������ռ�ʹ��ȫ�ֱ�����������Դ
 * 3�����ģϵͳ�У�Ϊ�����ܿ��ǣ���Ҫ��ʡ����Ĵ���ʱ��
 * 
 **/
public class MainClass {
	public static  void main(String[] args){
		Person person=Person.getInstance();
		person.setName("����");
		System.out.println(person.getName());
		
		Student student=Student.getInstance();
		student.setName("����");
		System.out.println(student.getName());
	}
}
