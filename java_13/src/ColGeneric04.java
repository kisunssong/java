import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColGeneric04 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		for(int i=1; i<=5; i++) {
			list.add(i); // 내부적으로 오토박싱과 업캐스팅 되면서 저장됨.
		}
/*
java.util패키지의 Iterator컬렉션 인터페이스 특징)
1.jdk1.2에서 추가되었고, 컬렉션에 저장된 복수개의 원소값을 순차적 방향으로 읽어옴.
*/
		
		Iterator list1 = list.iterator();
		while(list1.hasNext()) { // boolean타입으로 반환
			System.out.println(list1.next());
		}
	}
}
