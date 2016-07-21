package myuse.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.junit.Test;

import myuse.bean.Student;

/**
 * ʹ��BeanUtils(Apache�ĵ�����jar��,��Ҫcommons-logging.jar֧��)����bean������
 * @author DengLibin
 *
 */
public class MyBeanUtil {
	@Test
	public void testBeanUtils() throws IllegalAccessException, InvocationTargetException{
		@SuppressWarnings("unused")
		String name = "����";
		int age = 12;
		int id = 123;
		String birthday = "1992-12-12";
		Student stu = new Student();
		
		//Ϊ�������ڸ�ֵ��bean��birthday�������ϣ����Ǹ�beanutilsע��һ������ת����
		//ConvertUtils.register(new DateLocaleConverter(),Date.class);
		
		ConvertUtils.register(new Converter(){

			@SuppressWarnings("unchecked")
			@Override
			public  Date convert(Class type, Object value) {
				if(value == null){
					return null;
				}
				if(!(value instanceof String)){
					throw new ConversionException("ֻ֧��string���͵�ת��");
				}
				String str = (String)value;
				if(str.trim().equals("")){
					return null;
				}
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//��ʽ��birthday��ʽһ��
				try {
					return  df.parse(str);
				} catch (ParseException e) {
					e.printStackTrace();
					throw new RuntimeException(e);//�������ϲ��ף�˭���׸�˭���쳣�����ܶ�
				}
				
			}
			
		}, Date.class);
		
		
		BeanUtils.setProperty(stu, "name", "����");//��������ֵ
		BeanUtils.setProperty(stu, "age", age);//��������ֵ
		BeanUtils.setProperty(stu, "id", id);
		BeanUtils.setProperty(stu, "birthday", birthday);//��������ֵ
		
		System.out.println("name="+stu.getName()+";age="+stu.getAge()+";id="+stu.getId()+"birthday="+stu.getBirthday());
		
	}
	@Test
	public void testMap2Bean() throws IllegalAccessException, InvocationTargetException{
		Map<String, String> map = new HashMap<String,String>();
		map.put("name", "С��");
		map.put("age", "12");
		map.put("id","1324");
		map.put("birthday", "1998-02-04");
		
		Student stu = new Student();
		ConvertUtils.register(new DateLocaleConverter(),Date.class);
		BeanUtils.populate(stu, map);
		System.out.println(stu.getBirthday());
		System.out.println(stu.getName());
		System.out.println(stu.getAb());
	}
}

