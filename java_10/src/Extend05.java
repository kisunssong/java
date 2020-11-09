class Parent05 {
	void p05() {
		System.out.println("조상클래스 메서드 p05()");
	}
}
class Child05 extends Parent05 {

	void p05() {
		super.p05(); //조상클래스 메서드를 먼저 호출
		System.out.println("자손클래스에 맞는 문장 실행");
	}
	void ch05() {
		System.out.println("자손클래스 메서드 ch05");
	}
}

public class Extend05 {
	public static void main(String[] args) {
		Child05 c = new Child05();
		c.p05();	
		c.ch05();
	}
}
