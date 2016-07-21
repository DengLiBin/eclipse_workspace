package myuse.introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

import org.junit.Test;

import myuse.bean.Student;


/**
 * ��ʡIntrospector������javaBean�����������
 * @author DengLibin
 *
 */
public class MyIntrospector {
	//��ȡbean����������
	@Test
	public void testIntrospector() throws Exception{
		BeanInfo personInfo = Introspector.getBeanInfo(Student.class,Student.class.getSuperclass());//ȥ�������class����
		PropertyDescriptor[] pros = personInfo.getPropertyDescriptors();//��ȡbean������
		
		for(PropertyDescriptor pro : pros){
			System.out.println(pro.getName());
		}	
	}
	//����bean��ָ��������
	@Test
	public void testBeanProperty() throws Exception{
		Student stu = new Student();
		PropertyDescriptor pd = new PropertyDescriptor("age", Student.class);
		//��ȡ����д�ķ�����Ϊ���Ը�ֵ
		Method method = pd.getWriteMethod();
		method.invoke(stu, 14);
		System.out.println(stu.getAge());
		
		//ͨ����ʡ��ȡ���Ե�ֵ
		Method method2 = pd.getReadMethod();
		int age =(int) method2.invoke(stu, null);
		System.out.println(age);
	}
	
	//�߼�������ݣ���ȡ��ǰ�������Ե�����
	@Test
	public void testPropetyType() throws Exception{
		Student stu = new Student();
		PropertyDescriptor pd = new PropertyDescriptor("age", Student.class);
		
		System.out.println(pd.getPropertyType());
	}
}


