package LinkedHashMap����;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedMap {
	public static void main(String[] args) {
		LinkedHashMap<School, String> a=new LinkedHashMap<School, String>();
		a.put(new School("���", "�������"), "1");
		a.put(new School("�廪", "�����廪"), "2");
		a.put(new School("��Զ", "������Զ"), "3");
		Set<School> b = a.keySet();
		Iterator<School> it = b.iterator();
		while(it.hasNext()) {
			School next = it.next();
			System.out.println(next);
		}
		
		
		
		
		
	}
}
