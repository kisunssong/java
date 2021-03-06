
public class Date08 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		//String클래스는 자체 내용을 수정할 수 없고, String 클래스
		//하위의 메서드를 이용하여 문자열을 수정하면 수정된 내용을
		//갖는 새로운 문자열 객체가 생성된다.
		//StringBuffer는 새로운 문자열 객체가 생성되는것이 아니라
		//자신의 값을 변경할 수 있다는것이 String 클래스와의 큰 차이점
		
		System.out.println("sb == sb2 ? "+(sb == sb2));
		//sb == sb2 ? false
		
		System.out.println("sb.equals(sb2) ? "+(sb2.equals(sb2)));
		//sb.equals(sb2) ? false
		//s()메서드가 오버라이딩 되지 않아서 조상Object equals()메서드를
		//상속받아서 사용하면 자손클래스에서 어떤 값이 추가되었는지
		//알수가 없고, 주소값을 비교해서 결국 false가 된다.
		//sb는 String의 오버로딩된 생성자를 활용하고, sb2는 스트링버퍼의
		//메서드를 활용하자
		
		String s = new String(sb);
		String s2 = sb2.toString();
		
		sb.append("def");
		System.out.println(sb.toString());
		
		
	}
}
