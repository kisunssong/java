class Point04 {
	protected int x;
	protected int y=20;
/*
protected ���� ���� ������ Ű���� Ư¡)
�� �����ڴ� �� �ڽ�Ŭ����, ���� ������ �ٸ� Ŭ����, �ٸ� ������ ��ӹ��� �ڼ�Ŭ��������
���� �����ϴ�.
*/
}

class Point05 extends Point04 {
	protected int z=30;
	
	public void pr() {
		System.out.println("z: "+x+",y:"+y+",z:"+z);
	}
}

public class Extend03 {
	public static void main(String[] args) {
		Point05 p = new Point05();
		p.pr();
	
	}
}