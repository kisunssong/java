import net.abc.model01.AbsRef;
import net.abc.model02.Circ;
import net.abc.model02.Rect;
import net.abc.model02.Tria;


public class Abs12 {
	public static void main(String[] args) {
		
		Circ c = new Circ();
		c.draw();
		Rect r = new Rect();
		r.draw();
		Tria t = new Tria();
		t.draw();
		System.out.println("=====================");
		
		AbsRef ref;
		ref = new Circ();
		ref.draw();
		
		ref = new Tria();
		ref.draw();

		ref = new Rect();
		ref.draw();
		
		AbsRef[] arr = new AbsRef[3]; //배열크기가 3인 arr배열 생성
		arr[0] = new Circ();
		arr[1] = new Tria();
		arr[2] = new Rect();
		for(int i=0; i<arr.length; i++) {
			arr[i].draw();
		}
	}
}
