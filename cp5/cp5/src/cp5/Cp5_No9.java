package cp5;

import java.util.Scanner;									// 입력을 받기위해 Scanner 클래스 사용

public class Cp5_No9 {

	public static void main(String[] args) {
		double power, area, pressure;						// 힘의 크기, 면적, 압력 변수를 실수형으로 선언
		
		Scanner in = new Scanner(System.in);				// Scanner 객체 in 선언 
		
		System.out.print("힘의 크기를 입력하시오. : ");			// 입력 안내문 출력
		power = in.nextDouble();							// 실수형으로 입력받은 힘의 크기를 power 변수에 저장
		System.out.print("물체의 면적을 입력하시오. : ");
		area = in.nextDouble();								// 실수형으로 입력받은 면적을 area 변수에 저장
		
		pressure = power / area;							// 힘의 크기에 면적을 나눈 값을 pressure 변수에 저장 
		
		System.out.println("압력의 세기는 " + pressure + "입니다."); 		// 결과 출력

	}

}
