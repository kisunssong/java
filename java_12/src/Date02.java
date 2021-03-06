class Card extends Object {
	String kind;//카드종류
	int number;//카드번호
	
	Card() {
		this("SPADE",1);//같은 클래스내에 다른생성자를 호출
	}
	Card(String kind, int number) {
		this.kind = kind; 
		this.number = number;
	}
	
	public String toString() {
		return "카드종류: "+kind+", 카드번호: "+number;
	}
	
}


public class Date02 {
	public static void main(String[] args) {
		Card c = new Card();
		System.out.println(c);
		Card c1 = new Card("삼성카드",33);
		System.out.println(c1);
	}
}
