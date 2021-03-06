import java.util.HashMap;
import java.util.Map;

public class ColGeneric12 {
	public static void main(String[] args) {
/*
java.util의 map컬렉션 인터페이를 구현한 컬렉션 클래스 HashMapd의 특징)
1. jdk1.2에서 추가됨
2. 키,값 쌍으로 저장되고 중복키는 허용안됨, 중복값은 가질수 있다.
3. 키,값 쌍으로 저장되는 사전적인 자료구조이다. 키로 값을 검색하기 때문에
검색속도가 빠르다
*/

// 뒷부분 <> 제네릭 타입을 생략하면 앞부부만 보고도 어떤 타입인지 유추할수 있다.
//이 문법은 jdk1.7에서 추가됨.
		
		Map<String, Integer> m  = new HashMap<>();
		String[] sample = {"to","be","or","not","to","be","is","a","problem"};
			for(String a : sample) {
				Integer freq = m.get(a); //최초 키에 대한 값은 없기 때문에 null이다
				m.put(a, (freq == null) ? 1 : freq+1); //키,값 쌍으로 저장.
// 값에는 단어 빈도수가 저장됨.
				//to,be는 처음값이 1 들어가고, 또 to를 만나면 값이 있기때문에.. freq+1해서:2
				
			}
			System.out.println(m.size()+"단어가 있다.");
			System.out.println(m);
		}
	}
/*
7단어가 있다.
{a=1, not=1, be=2, or=1, problem=1, is=1, to=2}
*/

