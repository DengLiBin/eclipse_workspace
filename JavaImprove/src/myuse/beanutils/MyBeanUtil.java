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
 * 使用BeanUtils(Apache的第三方jar包,需要commons-logging.jar支持)操作bean的属性
 * @author DengLibin
 *
 */
public class MyBeanUtil {
	@Test
	public void testBeanUtils() throws IllegalAccessException, InvocationTargetException{
		@SuppressWarnings("unused")
		String name = "黎明";
		int age = 12;
		int id = 123;
		String birthday = "1992-12-12";
		Student stu = new Student();
		
		//为了让日期赋值到bean的birthday属性身上，我们给beanutils注册一个日期转换器
		//ConvertUtils.register(new DateLocaleConverter(),Date.class);
		
		ConvertUtils.register(new Converter(){

			@SuppressWarnings("unchecked")
			@Override
			public  Date convert(Class type, Object value) {
				if(value == null){
					return null;
				}
				if(!(value instanceof String)){
					throw new ConversionException("只支持string类型的转换");
				}
				String str = (String)value;
				if(str.trim().equals("")){
					return null;
				}
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//格式和birthday格式一样
				try {
					return  df.parse(str);
				} catch (ParseException e) {
					e.printStackTrace();
					throw new RuntimeException(e);//继续往上层抛（谁调抛给谁）异常链不能断
				}
				
			}
			
		}, Date.class);
		
		
		BeanUtils.setProperty(stu, "name", "李明");//设置属性值
		BeanUtils.setProperty(stu, "age", age);//设置属性值
		BeanUtils.setProperty(stu, "id", id);
		BeanUtils.setProperty(stu, "birthday", birthday);//设置属性值
		
		System.out.println("name="+stu.getName()+";age="+stu.getAge()+";id="+stu.getId()+"birthday="+stu.getBirthday());
		
	}
	@Test
	public void testMap2Bean() throws IllegalAccessException, InvocationTargetException{
		Map<String, String> map = new HashMap<String,String>();
		map.put("name", "小冰");
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


