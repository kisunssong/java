interface I {
	void play();
}

class B1 implements I {
	public void play() {
		System.out.println("play in B class");
	}
}

class C1 implements I {
	public void play() {
		System.out.println("play in C class");
	}	
}

class A1 {
	void autoPlay(I i) {
		i.play();
	}
}

//문제)매개변수 다형성 문법이 적용되면 A2클래스의 객체 a를 생성한 다음
//autoPlay() 메서드를 호출하여 업캐스팅하여 오버라이딩한 메서드를 호출
public class Inter09 {
	public static void main(String[] args) {
		A1 a = new A1();
		a.autoPlay(new B1());
		a.autoPlay(new C1());
	}
}

