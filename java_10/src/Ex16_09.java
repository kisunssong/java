class A {
	public A() {
		System.out.println("A() ������");
	}
}
class B extends A {
	public B() {		
		System.out.println("B() ������");
//		super(); // �����Ͽ���
		//�ڹٴ� ����Ŭ���� �����ڸ� ȣ���� ���� ������� ȣ���ؾ� �Ѵ�.
		//�׷��Ƿ� ù�ٿ� �������� �ڵ带 �ؾ� �Ѵ�.
	}
}
public class Ex16_09 {
	public static void main(String[] args) {
		A a = new B();
	}
}