import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date10 {
	public static void main(String[] args) {
		
		String[] data = {"bat","bady","cA","ca","co","c.","c0","car","date"};
		
		Pattern p = Pattern.compile("c[a-z]*");
		//정규표현식 기호 c[a-z]* 의 뜻은 c영문자로 시작되는 영문 소문자단어
		
		for(String str : data) {
			Matcher m = p.matcher(str);
			if(m.matches()) {
				//정규표현식에 맞는 것이 있으면 참
				System.out.printf(" "+str);
			}
		}
		System.out.println("==============================");
		
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source,",");
		
		while(st.hasMoreTokens()) { //분리된 토큰 문자열이 있다면 참
			System.out.println(" "+st.nextToken());
			//다음 토큰 문자열ㅇ르 가져와서 출력
		}
//		System.out.println(" "+st.nextToken());
		//java.util.NoSuchElementException오류
		//분리된 토큰은 한번 사용하면 더이상 사용못함. 토큰을 다시 분리해야함
		
	}
}
