package myuse.reflect;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

//����
import myuse.domain.Person;

/**
 * ���似�������������
 * @author DengLibin
 *
 */
public class MyReflect {
	public void reForName() throws Exception{
		
			//���ַ�ʽ��ȡ����������Ͷ���
			Class clazz = Class.forName("myuse.domain.Person");
			Class clazz2 = new Person(12,"sfgs").getClass();
			Class clazz3 = Person.class;
						
	}
	//������Ĺ��캯��
	public void parseClassConstuctor() throws Exception{
		Class clazz = Class.forName(Person.class.getName());
		Constructor<Person> con = clazz.getConstructor(String.class);
		Person p = (Person) con.newInstance("denglibin");
		System.out.println(p.getName());
		
		Constructor<Person> con2 = clazz.getConstructor(int.class,String.class);
		Person p2 = con2.newInstance(14,"����ʯ");
		System.out.println(p2.getName()+"---"+p2.getAge());
		
		
		
	}
	//�������˽�й��췽��
	public void parsePrivateConstructor() throws Exception{
		//����˽�еĹ��캯��
		Class clazz = Class.forName(Person.class.getName());
		//��������
		Constructor<Person> con3 = clazz.getDeclaredConstructor(int.class);
		con3.setAccessible(true);
		Person p3 = con3.newInstance(16);
		System.out.println(p3.getAge());
	}
	//ͨ�����䴴������
	@Test
	public void createInstance() throws Exception{
		Person person = Person.class.newInstance();//����Ҫ���޲εĹ��췽��
		System.out.println(person);
	}
	
	
	
	//������ķ���
	@Test
	public void refectMethods() throws Exception{
		Class<Person> clazz = (Class<Person>) Class.forName("myuse.domain.Person");
		Person p = clazz.newInstance();
		Method method = clazz.getMethod("aa1", null);
		method.invoke(p, null);
		
		Method method2 = clazz.getMethod("aa1", String.class, int[].class);	
		Class[] clazzs = (Class[]) method2.invoke(p, "laiba",new int[]{1,3,4});
		System.out.println(clazzs[0].getName());
		
		//��������
		Method method3 = clazz.getDeclaredMethod("aa1", int.class);
		method3.setAccessible(true);
		method3.invoke(null, 2345);//��̬�ķ�������Ҫ�����󣬴�����Ҳ��
		
		//����main����
		Method method4 = clazz.getMethod("main", String[].class);
		//��jdk1.4֮ǰ����û������ɱ������������ʱ���Զ������飬�൱�ڴ����������������汾Ϊ�˼���ǰ��İ汾����������Ҳ�������Ϊ�˲�������������飬������һЩ����
		method4.invoke(null, new Object[]{new String[]{"aa","bb"}});
		method4.invoke(null, (Object) new String[]{"cc","dd"});
	}
	
	//��������ֶ�
	@Test
	public void reflectFields() throws Exception{
		Class clazz = Class.forName("myuse.domain.Person");
		Person p= new Person();
		
		Field f = clazz.getField("name");
		
		if(f.getType().equals(String.class)){
			f.set(p, "���");
		}
		String name = (String) f.get(p);
		System.out.println("name =" + name+"----type = "+ f.getType());
		
		//˽���ֶΣ���������
		Field f2 = clazz.getDeclaredField("age");
		f2.setAccessible(true);
		
		if(f2.getType().equals(int.class)){
			f2.setInt(p, 23);
		}
			
		int age = f2.getInt(p);
		System.out.println("age = "+ age);
		
		//���侲̬�ֶ�
		Field f3 = clazz.getField("id");
		f3.set(null, 34);
		System.out.println(f3.getInt(null));
	}
}



