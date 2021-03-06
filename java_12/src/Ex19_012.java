/*
문제1) IShapeClass, Circ, Rect, Tria 를 활용해서 매개변수 다형성 문법을적용
하여 다음과 같은 출력 결과물을 만들어내자.
출력)  원을 그린다. 사각형을 그린다. 삼각형을 그린다.
참고로 별도의 static void pr(부모인터페이스타입 매개변수명)을 활용해서
다형성 문법을 적용한다.

문제2) 위의 인터페이스를 활용해서 배열크기가 3인 arr배열을 생성한 다음
반복문을 활용하여 동일 결과물을 출력하자.
*/
import com.naver.model.*;
import com.naver.model2.*;
public class Ex19_012 {
	static void pr(IShapeClass i) {
		i.draw();
	}
	
	public static void main(String[] args) {
		
		pr(new Circ());
		pr(new Rect());
		pr(new Tria());
		System.out.println("for");
		IShapeClass[] arr = {new Circ(), new Rect(), new Tria()};
		for(IShapeClass e : arr) {
			e.draw();
		}
	}
}
