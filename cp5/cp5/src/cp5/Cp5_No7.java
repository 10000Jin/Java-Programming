package cp5;

import java.util.Scanner;									// �Է��� �ޱ����� Scanner Ŭ���� ���

public class Cp5_No7 {

	public static void main(String[] args) {
		int pyeong;											// ����� ���������� ����
		double meter;										// �����͸� �Ǽ������� ����
		final double PYEONG = 3.3058;						// ��ȣ����� ����Ͽ� PYEONG�� 3.3058����
		
		Scanner in = new Scanner(System.in);				// Scanner ��ü in ����
		
		System.out.print("����� �Է��Ͻÿ�. : ");				// �Է� �ȳ��� ���
		pyeong = in.nextInt();								// �Է¹��� ���� pyeong ������ ����
		
		meter = pyeong * PYEONG;							// �Է¹��� ����� ��ȣ���(3.3058)�� ���� meter ������ ����
		
		System.out.print(pyeong + "���� " + meter + "m^2 �Դϴ�.");		// ��� ���
		
		in.close();											// Scanner ��ü�� �ݾ���
	}

}