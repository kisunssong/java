class A {
	public A() {
		System.out.println("A() 생성자");
	}
}
class B extends A {
	public B() {		
		System.out.println("B() 생성자");
//		super(); // 컴파일에러
		//자바는 조상클래스 생성자를 호출할 떄는 가장먼저 호출해야 한다.
		//그러므로 첫줄에 명시적인 코드를 해야 한다.
	}
}
public class Ex16_09 {
	public static void main(String[] args) {
		A a = new B();
	}
}
