/*
java.util��Ű���� �÷��� Map�������̽��� ��������� Hashtale�� Ư¡)
1.Ű,�� ������ ����Ǵ� �������� �ڷᱸ���̴�.
2.�ߺ�Ű�� ������� �ʰ� �ߺ����� ����Ѵ�.
3.Ű�� ���ؼ� ���� �˻��ϱ� ������ �˻��ӵ��� ������
*/

import java.util.*;
public class ColGeneric09 {
	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		ht.put("apple", "���");
		ht.put("orange", "������");
		ht.put("banana", "�ٳ���");
		
		String val = (String)ht.get("apple");
		System.out.println(val);
		
		Enumeration en2 = ht.keys();
		while(en2.hasMoreElements()) {
			Object k = en2.nextElement(); //Ű�� ����
			Object v = ht.get(k); //Ű�� ���� ���� ����
			System.out.println(k+" : "+v);
		}
		System.out.println("====================");
		Set kSet = ht.keySet();
		Iterator iter = kSet.iterator();
		for(int i=0; i<kSet.size(); i++) {
			String a = (String) iter.next();
		}
		
//		Iterator kIter = kSet.iterator();
//		while(kIter.hasNext()) {
//			System.out.println(kIter.next());
//		}
	}
}