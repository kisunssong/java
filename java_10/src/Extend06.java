class Point06 {
	protected int x=10;
	protected int y=20;
	
}
class Point07 extends Point06 {
	protected int x=40;
	protected int y=50;
	protected int z=30;
	
	public void p01() {
		System.out.printf("x:%d y:%d z:%d\n",x,y,z);
		System.out.printf("x:%d y:%d z:%d",super.x,super.y,z);
/*
super.�ν��Ͻ������ �� ����ϴ� ����)
�θ�Ŭ������ ����������� �ڼ�Ŭ������ ����������� ���� ��� �θ�� ���� ��ӹ��� ����
���� �����ϰ��� �� �� ����Ѵ�.
*/
	}
}

public class Extend06 {
	public static void main(String[] args) {
		Point07 p = new Point07();
		p.p01();
	}
}