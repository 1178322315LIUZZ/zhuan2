package TreeMap;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		//TreeMap具有排序功能的map容器
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(1, "corejava");
		tm.put(3, "javaweb");
		tm.put(2, "java进阶");
		tm.put(5, "java高级");
		tm.put(4, "RIA");
		tm.put(6, "SSH");
		Set<Entry<Integer,String>> entrySet = tm.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		System.out.println();
		

	}

}
