package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		HashMap<School, Integer> map=new HashMap<School, Integer>();
		map.put(new School("������ά����ѧԺ", "�����������Ƽ���·56��"), 1996);
		map.put(new School("�Ϻ���ά���ǽ���", "�Ϻ��з��������������Ĺ�·3389��"),2016);
		map.put(new School("�Ϻ���ά���ǽ���", "�Ϻ��з��������������Ĺ�·3389��"),2016);
		map.put(new School("��Ǩְҵ����ѧԺ", "��ԥ�������ϻ�·8��"),2015);
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
