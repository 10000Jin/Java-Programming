package cp8;

class BankAccount {
	private String name;											// private로 필드 선언
	private String account_num;
	private int rest;
	static final double interest_rate = 0.03;						// 메모리 낭비를 방지하기 위해 상수는 정적변수로 선언
	
	public BankAccount() {											// default 생성자
		this("Hong-Gil-Dong", "1234-00-5678", 10000);				// 다른 생성자 호출
	}
	public BankAccount(String n, String a, int r) {					// 매개변수를 가지는 생성자
		name = n;
		account_num = a;
		rest = r;
	}
	public String getName() { return name; }						// 각 필드들의 접근자
	public String getAccount_Num() { return account_num; }
	public int getRest() { return rest; }
	public void setBankAccount(String n, String a, int r) {			// 필드들의 설정자
		name = n;
		account_num = a;
		rest = r;
	}
	
	public String toString() {										// 객체 출력시 호출되는 메소드
		return "고객명 : " + name + " / 계좌번호 : " + account_num + 
				" / 잔액 : " + rest + " / 이자율 : " + interest_rate; 
	}
}

public class P222_No5_BankAccountTest {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("Kim-Chul-Soo", "9876-00-5432", 5000);		// b1 객체 생성후 매개변수 생성자를 호출해 초기화 
		BankAccount b2 = new BankAccount();											// b2 객체 생성후 default 생성자를 호출해 초기화
		
		System.out.println(b1);														// toString메소드를 호출해 객체의 필드 내용 호출
		System.out.println(b2);

		b2.setBankAccount("Lee-Young-Hee", "1029-00-3847", 250000);					// 설정자를 통해 필드의 내용 변경
		System.out.println(b2);														// toString메소드를 호출해 객체의 필드 내용 호출	
	}
}
