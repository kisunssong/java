package api.lang.sb;

public class StringBuilderExample {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder ("Java ");
		
		//문자열을 맨 끝에 추가하는 메서드 append()
		//하나의 객체 가지고 수정하며쓴다
		sb.append("Program Study");
		System.out.println(sb);
		
		//객체가 2개다 java따로, java + program study 따로
		String str = "Java ";
		str = str + "Program Study";
		System.out.println(str);
		
		//문자열을 특정 인덱스 위치에 삽입하는 메서드 insert()
		//12번 인덱스에 ming를 삽입
		sb.insert(12, "ming");
		System.out.println(sb);
		
		//5번 인덱스 부터 16번미만! 사이에 Book으로 교체
		sb.replace(5, 16, "Book");
		System.out.println(sb);
		
		//문자열을 삭제하는 메서드delete(begin, end)
		//4번 인덱스부터 9번인덱스미만! 까지 삭제
		sb.delete(4, 9);
		System.out.println(sb);
		
		//length 단위를 1부터 해서 공백포함 몇개? (인덱스만 0부터)
		System.out.println(sb.length());
	}
}
