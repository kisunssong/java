package day01;

import java.util.Scanner;

public class HelloJava {	
	
	//7,8줄 코드는 5줄 의 종속 하위코드다. 띄어쓰기 확인,세미콜론 확인, 중괄호 확인!
	public static void main(String[] args) {		
	
		System.out.println("안녕하세요!!");
		System.out.println(6 + 9);
		
	
		
		String c = "abc1234";
		String b = "abc1234";
		
		if(c == b) {
			System.out.println("같다");
		}else {
			System.out.println("틀리다");
		}
	}
}
