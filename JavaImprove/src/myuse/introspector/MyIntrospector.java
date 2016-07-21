package myuse.introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;

import myuse.bean.Student;


/**
 * 内省Introspector，操作javaBean，用于做框架
 * @author DengLibin
 *
 */
public class MyIntrospector {
	//获取bean的所有属性
	@Test
	public void testIntrospector() throws Exception{
		BeanInfo personInfo = Introspector.getBeanInfo(Student.class,Student.class.getSuperclass());//去除父类的class属性
		PropertyDescriptor[] pros = personInfo.getPropertyDescriptors();//获取bean的属性
		
		for(PropertyDescriptor pro : pros){
			System.out.println(pro.getName());
		}	
	}
	//操作bean的指定的属性
	@Test
	public void testBeanProperty() throws Exception{
		Student stu = new Student();
		PropertyDescriptor pd = new PropertyDescriptor("age", Student.class);
		//获取属性写的方法，为属性赋值
		Method method = pd.getWriteMethod();
		method.invoke(stu, 14);
		System.out.println(stu.getAge());
		
		//通过内省获取属性的值
		Method method2 = pd.getReadMethod();
		int age =(int) method2.invoke(stu, null);
		System.out.println(age);
	}
	
	//高级点的内容，获取当前操作属性的类型
	@Test
	public void testPropetyType() throws Exception{
		Student stu = new Student();
		PropertyDescriptor pd = new PropertyDescriptor("age", Student.class);
		
		System.out.println(pd.getPropertyType());
	}
}



