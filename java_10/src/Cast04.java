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
	String pixel; //ȭ�Ҽ�
	
	public DicaPhone() {}
	
	public DicaPhone(String model,String number, String pixel) {
		super(model, number);
		this.pixel=pixel;
	}
	public void prn() {
		System.out.println("��: "+model+"��ȣ: "+number+"ȭ�Ҽ�: "+pixel);
	}
	
}

public class Cast04 {
	public static void main(String[] args) {
		DicaPhone dp = new DicaPhone("������","010","0100");
		dp.prn();
	
	}
}