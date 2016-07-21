package test;

/*单例模式：
 * 为什么要使用单例模式：
 * 1、多个线程之间,比如servlet环境，共享同一个资源或者操作同一个对象
 * 2、在整个程序空间使用全局变量，共享资源
 * 3、大规模系统中，为了性能考虑，需要节省对象的创建时间
 * 
 **/
public class MainClass {
	public static  void main(String[] args){
		Person person=Person.getInstance();
		person.setName("张三");
		System.out.println(person.getName());
		
		Student student=Student.getInstance();
		student.setName("李四");
		System.out.println(student.getName());
	}
}
