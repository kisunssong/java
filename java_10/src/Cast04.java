class HandPhone {
	String model;
	String number;
	
	public HandPhone() {}
	public HandPhone(String model, String number) {
		this.model=model;
		this.number=number;
	}
}
class DicaPhone extends HandPhone {
	String pixel; //화소수
	
	public DicaPhone() {}
	
	public DicaPhone(String model,String number, String pixel) {
		super(model, number);
		this.pixel=pixel;
	}
	public void prn() {
		System.out.println("모델: "+model+"번호: "+number+"화소수: "+pixel);
	}
	
}

public class Cast04 {
	public static void main(String[] args) {
		DicaPhone dp = new DicaPhone("갤럭시","010","0100");
		dp.prn();
	
	}
}
