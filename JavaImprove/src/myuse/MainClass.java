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
		Integer i = 1;//װ�䣬Integer i = new  Integer(1);
		
		//����
		int j = i;
	
		//����Ӧ��
		List list = new ArrayList();
		list.add(1);//װ�䣬���ϴ���Ƕ������͵� 1�������ǻ����������� int 1
		list.add(2);
		list.add(3);
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getClass().getName());
		}
		//��ǿforѭ����ֻ�ʺ�ȡ����
		for (Object obj : list){
			int in = (Integer)obj;
			System.out.println(in);
		}
		Map map = new LinkedHashMap();
		map.put("1","aaa");
		map.put("2","bbb");
		map.put("3","ccc");
		map.put("4","ddd");
		//��ͳ��ʽ
		Set set = map.keySet();
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			String key = (String)ite.next();
			String value = (String) map.get(key);
			System.out.println(key+"="+value);
		}
		//��һ�ַ�ʽ
		Set set2 = map.entrySet();
		Iterator ite2 = set2.iterator();
		while(ite2.hasNext()){
			Map.Entry<String, String> entry = (Entry<String, String>) ite2.next();
			System.out.println(entry.getKey()+"=="+entry.getValue());
		}
		
		//����ǿforѭ��
		for(Object obj : map.entrySet()){
			Map.Entry<String, String> entry2 = (Entry<String, String>) obj;
			System.out.println(entry2.getKey()+"==="+entry2.getValue());
		}
	}
	
	
}
