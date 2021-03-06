/*
java.util패키지의 컬렉션 Map인터페이스를 구현상속한 Hashtale의 특징)
1.키,값 쌍으로 저장되는 사전적인 자료구조이다.
2.중복키는 허용하지 않고 중복값은 허용한다.
3.키를 통해서 값을 검색하기 때문에 검색속도가 빠르다
*/

import java.util.*;
public class ColGeneric09 {
	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		ht.put("apple", "사과");
		ht.put("orange", "오렌지");
		ht.put("banana", "바나나");
		
		String val = (String)ht.get("apple");
		System.out.println(val);
		
		Enumeration en2 = ht.keys();
		while(en2.hasMoreElements()) {
			Object k = en2.nextElement(); //키를 구함
			Object v = ht.get(k); //키에 대한 값을 구함
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
