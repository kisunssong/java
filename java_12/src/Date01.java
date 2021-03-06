import java.util.Calendar;

public class Date01 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH+1);//1월을 0으로 반환해서+1
		int date = cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일\n",year,month,date);
		System.out.printf("%d시 %d분 %d초",hour,minute,second);
	}
}
/*
2020년 46월 13일
9시 25분 52초
*/