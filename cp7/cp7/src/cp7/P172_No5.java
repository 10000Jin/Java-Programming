package cp7;

import java.util.Scanner;							// �Է��� �ޱ� ���� Scanner Ŭ���� ���

class Reverse_Print {								// ���ڿ��� �ݴ�� ����ϴ� Ŭ���� ����
	
	void reverse() {
		String msg;									// ���ڿ��� ������ �ʵ�� 
		int len;									// ���ڿ��� ���̸� ������ �ʵ� ����
		
		Scanner sc = new Scanner(System.in);		// Scanner�� ��ü sc ����
		System.out.print("���ڿ��� �Է��Ͻÿ�. : ");		// �Է� �ȳ��� ���
		msg = sc.nextLine();						// �Է¹��� ���ڿ��� msg�� ����
		
		len = msg.length();							// msg�� ���̸� len�� ����
		for (int i=len-1; i>=0; i--) {				// for������ ���ڿ��� ������ ��������
			System.out.print(msg.charAt(i));		// 0�������� ���(����)
		}
		sc.close();									// Scanner ��ü�� �ݾ���
	}
}


public class P172_No5 {

	public static void main(String[] args) {
		
		Reverse_Print s = new Reverse_Print();		// Reverse_Print Ŭ������ ��ü s ����
		s.reverse();								// ��ü�� ���ڿ��� ���� ����ϴ� �޼ҵ� ȣ��
	}
}
