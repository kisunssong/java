class Point02 {
	private int x;
	private int y;
// �����ڰ� �����ε��� �ȵ� ���� �ڹ� �����Ϸ��� ���ؼ� �Ű������� ���� �⺻�����ڸ�
// ���������� �����Ѵ�.
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
class Point03 extends Point02 {
	private int z; //������ x,y�� private���� ���ǵǾ��� ������ �ڼ�Ŭ�������� ����X

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}

public class Extend02 {
	public static void main(String[] args) {
		
		Point03 pt = new Point03();
		pt.setX(10); //��ӹ޾� ���
		pt.setY(20); //��ӹ޾� ���
		pt.setZ(30); //���β� ���
		
		System.out.printf("X��ǥ:%d Y��ǥ:%d ������ǥ:%d"
						   ,pt.getX(),pt.getY(),pt.getZ());
	}
}