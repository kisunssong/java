abstract class Shape09 {
	abstract void make();
}
class House extends Shape09 {
	void make() {
		System.out.println("���� ���´�.");
	}
}
class Brideg extends Shape09 {
	void make() {
		System.out.println("�ٸ��� �Ǽ��Ѵ�.");
	}
}
class Building extends Shape09 {
	void make() {
		System.out.println("������ ���´�.");
	}
}
public class WeekEx09 {	
	 void print(Shape09 a) {
		a.make();
	}
	public static void main(String[] args) {
		
		House h = new House();
		Brideg br = new Brideg();
		Building bu = new Building();
		
		Shape09[] arr = {h,br,bu};
		System.out.println("====for�� ��� ������====");
		for(Shape09 search : arr) {
			search.make();
		}
		System.out.println("====�Ű����� ȣ�� ������====");
		WeekEx09 w = new WeekEx09();
		w.print(h);
		w.print(br);
		w.print(bu);
		
	}
}