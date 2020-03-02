package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		HashMap<School, Integer> map=new HashMap<School, Integer>();
		map.put(new School("北京八维研修学院", "北京海淀区唐家岭路56号"), 1996);
		map.put(new School("上海八维宏烨教育", "上海市奉贤区海湾镇五四公路3389号"),2016);
		map.put(new School("上海八维宏烨教育", "上海市奉贤区海湾镇五四公路3389号"),2016);
		map.put(new School("宿迁职业技术学院", "宿豫区新区合欢路8号"),2015);
		Set<School> keySet = map.keySet();
		for (School school : keySet) {
			System.out.println(school);
		}
		System.out.println();
		Set<Entry<School,Integer>> entrySet = map.entrySet();
		for (Entry<School, Integer> entry : entrySet) {
			System.out.println(entry);
		}


	}

}
