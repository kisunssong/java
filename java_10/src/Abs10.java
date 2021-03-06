abstract class Abstract10 {
/*
추상클래스 특징)
1. 추상클래스에는 추상메서드가 올 수 있따. 추상메서드는 {}가 없고 실행문장이 없고
호출이 불가능하다.
2. 추상클래스에는 일반 속성, 메서드도 올 수 있다.
3. 추상클래스를 상속받은 일반 자손클래스에서 반드시 조상의 추상메서드를 오버라이딩을 해야
자손클래스 객체 생성이 가능하다.(제일 중요)
4. 추상메서드는 추상클래스와 마찬가지로 abstract 키워드로 정의한다.
*/
	abstract void m01();
	void m02() {
		System.out.println("일반 메서드 m02()");
	}
}

class SubClass10 extends Abstract10 {
	@Override
	void m01() {
		System.out.println("조상 추상메서드 오버라이딩m01()");
	}
	
}
public class Abs10 {
	public static void main(String[] args) {
		SubClass10 obj = new SubClass10();
		obj.m01();
		obj.m02();
		System.out.println("----------------------");
		
		Abstract10 abs;
		abs = new SubClass10();
		abs.m01();
		abs.m02();
		System.out.println("-----------------------");
		
		SubClass10 s = (SubClass10)abs;
		s.m01();
		s.m02();
	}
}
