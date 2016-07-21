package myuse.reflect;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

//反射
import myuse.domain.Person;

/**
 * 反射技术，用于做框架
 * @author DengLibin
 *
 */
public class MyReflect {
	public void reForName() throws Exception{
		
			//三种方式获取对象的类类型对象
			Class clazz = Class.forName("myuse.domain.Person");
			Class clazz2 = new Person(12,"sfgs").getClass();
			Class clazz3 = Person.class;
						
	}
	//解剖类的构造函数
	public void parseClassConstuctor() throws Exception{
		Class clazz = Class.forName(Person.class.getName());
		Constructor<Person> con = clazz.getConstructor(String.class);
		Person p = (Person) con.newInstance("denglibin");
		System.out.println(p.getName());
		
		Constructor<Person> con2 = clazz.getConstructor(int.class,String.class);
		Person p2 = con2.newInstance(14,"蒋介石");
		System.out.println(p2.getName()+"---"+p2.getAge());
		
		
		
	}
	//反射类的私有构造方法
	public void parsePrivateConstructor() throws Exception{
		//揭剖私有的构造函数
		Class clazz = Class.forName(Person.class.getName());
		//暴力反射
		Constructor<Person> con3 = clazz.getDeclaredConstructor(int.class);
		con3.setAccessible(true);
		Person p3 = con3.newInstance(16);
		System.out.println(p3.getAge());
	}
	//通过反射创建对象
	@Test
	public void createInstance() throws Exception{
		Person person = Person.class.newInstance();//必须要有无参的构造方法
		System.out.println(person);
	}
	
	
	
	//反射类的方法
	@Test
	public void refectMethods() throws Exception{
		Class<Person> clazz = (Class<Person>) Class.forName("myuse.domain.Person");
		Person p = clazz.newInstance();
		Method method = clazz.getMethod("aa1", null);
		method.invoke(p, null);
		
		Method method2 = clazz.getMethod("aa1", String.class, int[].class);	
		Class[] clazzs = (Class[]) method2.invoke(p, "laiba",new int[]{1,3,4});
		System.out.println(clazzs[0].getName());
		
		//暴力反射
		Method method3 = clazz.getDeclaredMethod("aa1", int.class);
		method3.setAccessible(true);
		method3.invoke(null, 2345);//静态的方法不需要传对象，传对象也行
		
		//反射main方法
		Method method4 = clazz.getMethod("main", String[].class);
		//在jdk1.4之前由于没有引入可变参数，传数组时会自动拆开数组，相当于传入多个参数，后续版本为了兼容前面的版本，传入数组也会拆，所以为了不让虚拟机拆开数组，可以做一些处理
		method4.invoke(null, new Object[]{new String[]{"aa","bb"}});
		method4.invoke(null, (Object) new String[]{"cc","dd"});
	}
	
	//反射类的字段
	@Test
	public void reflectFields() throws Exception{
		Class clazz = Class.forName("myuse.domain.Person");
		Person p= new Person();
		
		Field f = clazz.getField("name");
		
		if(f.getType().equals(String.class)){
			f.set(p, "李兵");
		}
		String name = (String) f.get(p);
		System.out.println("name =" + name+"----type = "+ f.getType());
		
		//私有字段，暴力反射
		Field f2 = clazz.getDeclaredField("age");
		f2.setAccessible(true);
		
		if(f2.getType().equals(int.class)){
			f2.setInt(p, 23);
		}
			
		int age = f2.getInt(p);
		System.out.println("age = "+ age);
		
		//反射静态字段
		Field f3 = clazz.getField("id");
		f3.set(null, 34);
		System.out.println(f3.getInt(null));
	}
}




