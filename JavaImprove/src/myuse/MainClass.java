package myuse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class MainClass {

	public static void main(String[] args) {
		Integer i = 1;//装箱，Integer i = new  Integer(1);
		
		//拆箱
		int j = i;
	
		//典型应用
		List list = new ArrayList();
		list.add(1);//装箱，集合存的是对象类型的 1，而不是基本数据类型 int 1
		list.add(2);
		list.add(3);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getClass().getName());
		}
		//增强for循环，只适合取数据
		for (Object obj : list){
			int in = (Integer)obj;
			System.out.println(in);
		}
		Map map = new LinkedHashMap();
		map.put("1","aaa");
		map.put("2","bbb");
		map.put("3","ccc");
		map.put("4","ddd");
		//传统方式
		Set set = map.keySet();
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			String key = (String)ite.next();
			String value = (String) map.get(key);
			System.out.println(key+"="+value);
		}
		//另一种方式
		Set set2 = map.entrySet();
		Iterator ite2 = set2.iterator();
		while(ite2.hasNext()){
			Map.Entry<String, String> entry = (Entry<String, String>) ite2.next();
			System.out.println(entry.getKey()+"=="+entry.getValue());
		}
		
		//用增强for循环
		for(Object obj : map.entrySet()){
			Map.Entry<String, String> entry2 = (Entry<String, String>) obj;
			System.out.println(entry2.getKey()+"==="+entry2.getValue());
		}
	}
	
	
}
