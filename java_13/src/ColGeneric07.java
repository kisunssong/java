import java.util.Enumeration;
import java.util.Vector;

public class ColGeneric07 {
	public static void main(String[] args) {
		
		Vector vec = new Vector();
		double[] arr = new double[] {38.6,9.2,45.3,6.1,4.7,1.6};
		
		for(int i=0; i<arr.length; i++) {
			vec.add(arr[i]);
			System.out.printf(vec.get(i)+" ");
			//38.6 9.2 45.3 6.1 4.7 1.6 
		}
		System.out.println();
		System.out.println("벡터크기: "+vec.size());
		//벡터크기: 6
		
		System.out.println("===Enumeration 사용해서 벡터 값 가져오기===");
		Enumeration en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement());
			//38.69.245.36.14.71.6
		}
		System.out.println();
		System.out.println("==================================");
		double findData=6.1;
		//해당원소값을 벡터로부터 찾아서 위치번호를반환, 없으면 -1 반환
		int index = vec.indexOf(findData);
		
		if(index != -1) {
			System.out.println("있음 index: "+index);
			//있음 index: 3
		}else {
			System.out.println("없음 index: "+index);
		}
		
		double delData=45.3;
		if(vec.contains(delData)) {
			vec.remove(delData);
			System.out.println("삭제 index: "+delData);
			//삭제 index: 45.3
		}
		
		for(int i=0; i<vec.size(); i++) {
			System.out.print(vec.get(i)+" ");
			//38.6 9.2 6.1 4.7 1.6 
		}
		
	}
}

