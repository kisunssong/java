import java.util.Vector;

public class ColGeneric16 {
	public static void main(String[] args) {
		
		Vector<String> list = new Vector<>();
		list.add("사과");
		list.add("바나나");
		list.add("오렌지");
		
		Vector<? extends Object> objlist; //제네릭타입 업캐스팅을 할건지?
		objlist = list;//제네릭 타입간의 형변환은 안된다.
		System.out.println(objlist); //<? extends Object>
	}
}
