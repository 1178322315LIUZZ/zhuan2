package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer, School> hm=new HashMap<Integer, School>();
		School a=new School("����", "��������");
		School b=new School("����", "��������");
		School c=new School("ʤ��", "����ʤ��");
		School d=new School("ʤ��", "����ʤ");
		hm.put(1162004000, a);
		hm.put(1162004001, b);
		hm.put(1162004002, c);
		hm.put(1162004002, d);
		//��ָ��һ��
		boolean containsKey = hm.containsKey(1162004000);
		System.out.println(containsKey);
		System.out.println();
		//��ָ�ڶ���
		boolean containsValue = hm.containsValue(b);
		System.out.println(containsKey);
		//�ж��Ƿ�Ϊ��
		System.out.println(hm.isEmpty());
		System.out.println();
		//ɾ���ǵ�һ����ֵ
		hm.remove(1162004000);
		System.out.println();
		System.out.println(hm);
		System.out.println();
		
		//��������
		//����������
		Set<Integer> keySet = hm.keySet();
		for (Integer integer : keySet) {
			System.out.println(integer);
		}
		System.out.println();
		//����ֵ����
		Collection<School> values = hm.values();
		for (School school : values) {
			System.out.println(school);
		}
		System.out.println();
		//�������м���
		Set<Entry<Integer,School>> entrySet = hm.entrySet();
		for (Entry<Integer, School> entry : entrySet) {
			System.out.println(entry);
		}
		
		
		
	}

}
