package cp5;

import java.util.Scanner;									// 입력을 받기위해 Scanner 클래스 사용

public class Cp5_No7 {

	public static void main(String[] args) {
		int pyeong;											// 평수를 정수형으로 선언
		double meter;										// 평방미터를 실수형으로 선언
		final double PYEONG = 3.3058;						// 기호상수를 사용하여 PYEONG에 3.3058저장
		
		Scanner in = new Scanner(System.in);				// Scanner 객체 in 생성
		
		System.out.print("평수를 입력하시오. : ");				// 입력 안내문 출력
		pyeong = in.nextInt();								// 입력받은 값을 pyeong 변수에 저장
		
		meter = pyeong * PYEONG;							// 입력받은 평수에 기호상수(3.3058)를 곱해 meter 변수에 저장
		
		System.out.print(pyeong + "평은 " + meter + "m^2 입니다.");		// 결과 출력
		
		in.close();											// Scanner 객체를 닫아줌
	}

}