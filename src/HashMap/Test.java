package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer, School> hm=new HashMap<Integer, School>();
		School a=new School("红星", "北京红星");
		School b=new School("百威", "北京百威");
		School c=new School("胜利", "北京胜利");
		School d=new School("胜利", "北京胜");
		hm.put(1162004000, a);
		hm.put(1162004001, b);
		hm.put(1162004002, c);
		hm.put(1162004002, d);
		//是指第一个
		boolean containsKey = hm.containsKey(1162004000);
		System.out.println(containsKey);
		System.out.println();
		//是指第二个
		boolean containsValue = hm.containsValue(b);
		System.out.println(containsKey);
		//判断是否为空
		System.out.println(hm.isEmpty());
		System.out.println();
		//删除是第一个数值
		hm.remove(1162004000);
		System.out.println();
		System.out.println(hm);
		System.out.println();
		
		//遍历方法
		//遍历键集合
		Set<Integer> keySet = hm.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
		}
		System.out.println();
		//遍历值集合
		Collection<School> values = hm.values();
		for (School school : values) {
			System.out.println(school);
		}
		System.out.println();
		//遍历所有集合
		Set<Entry<Integer,School>> entrySet = hm.entrySet();
		for (Entry<Integer, School> entry : entrySet) {
			System.out.println(entry);
		}
		
		
		
	}

}
