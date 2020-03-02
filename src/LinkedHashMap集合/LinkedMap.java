package LinkedHashMap集合;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedMap {
	public static void main(String[] args) {
		LinkedHashMap<School, String> a=new LinkedHashMap<School, String>();
		a.put(new School("宏达", "北京宏达"), "1");
		a.put(new School("清华", "北京清华"), "2");
		a.put(new School("博远", "北京博远"), "3");
		Set<School> b = a.keySet();
		Iterator<School> it = b.iterator();
		while(it.hasNext()) {
			School next = it.next();
			System.out.println(next);
		}
		
		
		
		
		
	}
}
