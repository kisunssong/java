class Point04 {
	protected int x;
	protected int y=20;
/*
protected 접근 권한 제어자 키워드 특징)
이 제어자는 내 자신클래스, 같은 폴더의 다른 클래스, 다른 폴더의 상속받은 자손클래스에서
접근 가능하다.
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
