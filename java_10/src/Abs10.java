abstract class Abstract10 {
/*
�߻�Ŭ���� Ư¡)
1. �߻�Ŭ�������� �߻�޼��尡 �� �� �ֵ�. �߻�޼���� {}�� ���� ���๮���� ����
ȣ���� �Ұ����ϴ�.
2. �߻�Ŭ�������� �Ϲ� �Ӽ�, �޼��嵵 �� �� �ִ�.
3. �߻�Ŭ������ ��ӹ��� �Ϲ� �ڼ�Ŭ�������� �ݵ�� ������ �߻�޼��带 �������̵��� �ؾ�
�ڼ�Ŭ���� ��ü ������ �����ϴ�.(���� �߿�)
4. �߻�޼���� �߻�Ŭ������ ���������� abstract Ű����� �����Ѵ�.
*/
	abstract void m01();
	void m02() {
		System.out.println("�Ϲ� �޼��� m02()");
	}
}

class SubClass10 extends Abstract10 {
	@Override
	void m01() {
		System.out.println("���� �߻�޼��� �������̵�m01()");
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