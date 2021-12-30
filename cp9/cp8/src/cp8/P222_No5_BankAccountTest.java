package cp8;

class BankAccount {
	private String name;											// private�� �ʵ� ����
	private String account_num;
	private int rest;
	static final double interest_rate = 0.03;						// �޸� ���� �����ϱ� ���� ����� ���������� ����
	
	public BankAccount() {											// default ������
		this("Hong-Gil-Dong", "1234-00-5678", 10000);				// �ٸ� ������ ȣ��
	}
	public BankAccount(String n, String a, int r) {					// �Ű������� ������ ������
		name = n;
		account_num = a;
		rest = r;
	}
	public String getName() { return name; }						// �� �ʵ���� ������
	public String getAccount_Num() { return account_num; }
	public int getRest() { return rest; }
	public void setBankAccount(String n, String a, int r) {			// �ʵ���� ������
		name = n;
		account_num = a;
		rest = r;
	}
	
	public String toString() {										// ��ü ��½� ȣ��Ǵ� �޼ҵ�
		return "���� : " + name + " / ���¹�ȣ : " + account_num + 
				" / �ܾ� : " + rest + " / ������ : " + interest_rate; 
	}
}

public class P222_No5_BankAccountTest {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Kim-Chul-Soo", "9876-00-5432", 5000);		// b1 ��ü ������ �Ű����� �����ڸ� ȣ���� �ʱ�ȭ 
		BankAccount b2 = new BankAccount();											// b2 ��ü ������ default �����ڸ� ȣ���� �ʱ�ȭ
		
		System.out.println(b1);														// toString�޼ҵ带 ȣ���� ��ü�� �ʵ� ���� ȣ��
		System.out.println(b2);

		b2.setBankAccount("Lee-Young-Hee", "1029-00-3847", 250000);					// �����ڸ� ���� �ʵ��� ���� ����
		System.out.println(b2);														// toString�޼ҵ带 ȣ���� ��ü�� �ʵ� ���� ȣ��	
	}
}
