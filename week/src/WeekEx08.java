abstract class Father08 {
	void f08() {
		System.out.println("�߻�Ŭ�������� �Ϲ� �޼��嵵 �ü� �ִ�");
	}
	//����� abstract��. {} ������ �Ⱦ���. ;����
	abstract void f09();
	
}
class Child08 extends Father08 {
	//�߻�Ŭ���� ��ӽ� ������ �������̵��ؾ��Ѵ�.
	void f09() {
		System.out.println("�߻�޼��� �������̵�");
	}
}

public class WeekEx08 {
	public static void main(String[] args) {
		Father08 f; //�߻�Ŭ������ �������� ���𰡴�
		f = new Child08();
		f.f08(); //Father08 �� ���� �Ϲݸ޼���
		f.f09(); //Father08 �� ���� ���� �������̵��޼���
		
		Child08 c = (Child08)f; //�ٿ�ĳ���� ����
		c.f08(); //��ӹ����� ȣ��
		c.f09();
	}
}