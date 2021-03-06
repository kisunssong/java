/*
문제) 1. com.naver.model 패키지를 생성해서 인터페이스로 IshapeClass를 만들고
추상 메서드로 void draw(); 를 정의한다.
2. com.naver.model2를 패키지를 생성하고 위의 인터페이스를 구현 상속받은
자손클래스 Circ,Rect,Tria를 만든다. 그런다음 pt소스를 참고해서 다음과 같은 
출력 결과물을 완성
*/
import com.naver.model.IShapeClass;
import com.naver.model2.Circ;
import com.naver.model2.Rect;
import com.naver.model2.Tria;
public class Ex19_01 {
	public static void main(String[] args) {
		
		IShapeClass a = new Circ();
		IShapeClass b = new Rect();
		IShapeClass c = new Tria();
		IShapeClass[] arr = {a,b,c};
		for(IShapeClass e : arr) {
			e.draw();
		}
	}
}
