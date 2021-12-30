package cp10;

import java.util.Scanner;										// 입력을 받기위해 Scanner 클래스 사용

public class P238_No4_ConvertTest {

	public static void main(String[] args) {
		String hexa;											// 16진수 문자열을 저장할 필드
		
		Scanner sc = new Scanner(System.in);					// Scanner 객체 sc 생성
		System.out.print("16진수 문자열을 입력하시오. ");				// 입력 안내문 출력
		hexa = sc.nextLine();									// 입력된 문자열을 hexa에 저장
		
		String[] hexa2bin = {"0000", "0001", "0010","0011",		// 16진수 0~f에 해당하는 2진수
							"0100", "0101", "0110", "0111", 	// 값들의 배열
							"1000", "1001", "1010", "1011",
							"1100", "1101", "1110", "1111"};
		
		String[] result = new String[hexa.length()];			// 2진수로 바꾼 값들이 저장될 result배열 선언과 동시에 생성
																// 배열의 크기는 hexa의 크기
		
		for (int i = 0; i < hexa.length(); i++) {
			if ((int)hexa.charAt(i) >= 48 && (int)hexa.charAt(i) <= 57) {		// 문자의 아스키 값이 숫자에 해당하면
				result[i] = hexa2bin[(int)hexa.charAt(i) - 48];				// 아스키 값에 48을 뺴 hexa2bin에서 맞는 인덱스의 값을
			}																// result 배열에 저장
			else if ((int)hexa.charAt(i) >= 97 && (int)hexa.charAt(i) <= 102) {	// 문자의 아스키 값이 a~f에 해당하면 
				result[i] = hexa2bin[(int)hexa.charAt(i) - 87];				// 아스키 값에서 87을 뺀 값을 result에 저장
			}
		}
		
		System.out.print(hexa + "에 대한 이진수는 ");
		for(String value : result)								// for-each 루프를 사용해 result 출력
			System.out.print(value + " ");
		System.out.print("입니다.");
		
		sc.close();												// Scanner의 sc객체 닫아줌
	}
}
