class Mt02 {
	void pr(int... i) {
		for(int n : i) 
		System.out.printf(n+" ");
		System.out.println();
	}
}
public class Ex2_02 {
	public static void main(String[] args) {
		Mt02 m = new Mt02();
		m.pr(10);
		m.pr(10,20);
	}
}
