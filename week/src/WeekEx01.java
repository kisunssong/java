class Point01 { //�ְ����� Object
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
}
class Child01 extends Point01 {
	private int z;
	
	public void setZ(int z) {
		this.z = z;
	}
	public int getZ() {
		return z;
	}
}

public class WeekEx01 {
	public static void main(String[] args) {
		Child01 ch = new Child01();
		ch.setX(100); //��� �޼��� ȣ��(����100 -> �Ű�����100)
		ch.setY(200); //��� �޼��� ȣ��(����200 -> �Ű�����200)
		ch.setZ(300); //���� �޼��� ȣ��(����300 -> �Ű�����300)
		
		System.out.printf("X��ǥ:%d Y��ǥ:%d Z��ǥ:%d",ch.getX(),ch.getY(),ch.getZ());
		//X��ǥ:100 Y��ǥ:200 Z��ǥ:1000000
	}
}