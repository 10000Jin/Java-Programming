package cp7;

import java.util.Scanner;							// 입력을 받기 위해 Scanner 클래스 사용

class Reverse_Print {								// 문자열을 반대로 출력하는 클래스 정의
	
	void reverse() {
		String msg;									// 문자열을 저장할 필드와 
		int len;									// 문자열의 길이를 저장할 필드 정의
		
		Scanner sc = new Scanner(System.in);		// Scanner의 객체 sc 생성
		System.out.print("문자열을 입력하시오. : ");		// 입력 안내문 출력
		msg = sc.nextLine();						// 입력받은 문자열을 msg에 저장
		
		len = msg.length();							// msg의 길이를 len에 저장
		for (int i=len-1; i>=0; i--) {				// for문으로 문자열의 마지막 번지부터
			System.out.print(msg.charAt(i));		// 0번지까지 출력(역순)
		}
		sc.close();									// Scanner 객체를 닫아줌
	}
}


public class P172_No5 {

	public static void main(String[] args) {
		
		Reverse_Print s = new Reverse_Print();		// Reverse_Print 클래스의 객체 s 생성
		s.reverse();								// 객체의 문자역을 역순 출력하는 메소드 호출
	}
}
