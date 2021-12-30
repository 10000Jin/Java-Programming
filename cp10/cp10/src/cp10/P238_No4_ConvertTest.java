package cp10;

import java.util.Scanner;										// �Է��� �ޱ����� Scanner Ŭ���� ���

public class P238_No4_ConvertTest {

	public static void main(String[] args) {
		String hexa;											// 16���� ���ڿ��� ������ �ʵ�
		
		Scanner sc = new Scanner(System.in);					// Scanner ��ü sc ����
		System.out.print("16���� ���ڿ��� �Է��Ͻÿ�. ");				// �Է� �ȳ��� ���
		hexa = sc.nextLine();									// �Էµ� ���ڿ��� hexa�� ����
		
		String[] hexa2bin = {"0000", "0001", "0010","0011",		// 16���� 0~f�� �ش��ϴ� 2����
							"0100", "0101", "0110", "0111", 	// ������ �迭
							"1000", "1001", "1010", "1011",
							"1100", "1101", "1110", "1111"};
		
		String[] result = new String[hexa.length()];			// 2������ �ٲ� ������ ����� result�迭 ����� ���ÿ� ����
																// �迭�� ũ��� hexa�� ũ��
		
		for (int i = 0; i < hexa.length(); i++) {
			if ((int)hexa.charAt(i) >= 48 && (int)hexa.charAt(i) <= 57) {		// ������ �ƽ�Ű ���� ���ڿ� �ش��ϸ�
				result[i] = hexa2bin[(int)hexa.charAt(i) - 48];				// �ƽ�Ű ���� 48�� �� hexa2bin���� �´� �ε����� ����
			}																// result �迭�� ����
			else if ((int)hexa.charAt(i) >= 97 && (int)hexa.charAt(i) <= 102) {	// ������ �ƽ�Ű ���� a~f�� �ش��ϸ� 
				result[i] = hexa2bin[(int)hexa.charAt(i) - 87];				// �ƽ�Ű ������ 87�� �� ���� result�� ����
			}
		}
		
		System.out.print(hexa + "�� ���� �������� ");
		for(String value : result)								// for-each ������ ����� result ���
			System.out.print(value + " ");
		System.out.print("�Դϴ�.");
		
		sc.close();												// Scanner�� sc��ü �ݾ���
	}
}
