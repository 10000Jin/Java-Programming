
import java.util.Scanner;							// �Է��� �ޱ����� Scanner Ŭ���� ���

public class Conversion {

	public static void main(String[] args) {
		
		int height, feet;							// cm Ű, feet �κ��� ���������� ����
		double i_height, inch;						// inch Ű, inch �κ��� �Ǽ������� ����
		final double INCH = 2.54;					// INCH�� 2.54�� ������ ��ȣ��� ����
		final int FEET = 12;						// FEET�� 12�� ������ ��ȣ��� ����
		
		Scanner in = new Scanner(System.in);		// Scanner ��ü�� ����
		
		System.out.print("Ű�� �Է��Ͻÿ�. : ");		
		height = in.nextInt();						// �Է¹��� ���� height ������ ����
		
		i_height = height / INCH;					// cm Ű�� 2.54�� ���� inch�� ��ȯ�Ͽ� inch Ű ������ ����
		feet = (int)(i_height / FEET);				// inch Ű�� 12�� ���� feet�� ��ȯ�� ���� ���������� ����ȯ�Ͽ� feet �κп� ����
		inch = i_height % FEET;						// inch Ű�� 12�� ���� �������� inch �κп� ����
		
		System.out.println(height + "cm�� " + feet + "��Ʈ " + inch + "��ġ�Դϴ�.");		// ��� ���

	}

}
