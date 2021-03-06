import java.util.ArrayList;
import java.util.ListIterator;

/*
java.util패키지의 컬렉션 ListIterator 인터페이스 특징)
1. jdk1.2에서 추가, Iterator인터페이스를 상속받음
2. 순방향, 역방향, 양방향 모두 데이터 접근 가능, 컬렉션 List인터페이스를 구현한 자손
에서만 사용해야 한다.
*/
public class ColGeneric05 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		ListIterator it = list.listIterator();
		
		//순방향 출력
		while(it.hasNext()) { //이전원소값 있다면 참
			System.out.println(" "+it.next());
		}
		System.out.println("===============");
		
		//역방향 출력
		while(it.hasPrevious()) {
			System.out.println(" "+it.previous());
		}
	}
}
