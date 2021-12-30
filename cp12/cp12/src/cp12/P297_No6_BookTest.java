package cp12;

abstract class Book{											// 추상 클래스 Book 정의
	private String title;										// 제목, 작가, 관리번호 필드
	private String auther;										// private로 선언
	private int number;
	
	public Book(String t, String a, int n) {					// Book의 매개변수 생성자
		title = t;
		auther = a;
		number = n;
		System.out.println("Book 생성자");
	}
	
	public String getTitle() { return title; }					// 각 필드들의 접근자
	public String getAuther() { return auther; }
	public int getNumber() { return number; }
	public void setTitle(String t) { title = t; }				// 각 필드들의 설정자
	public void setAuther(String a) { auther = a; }
	public void setNumber(int n) {number = n;}
	
	public abstract void getLateFees(int day);					// 연체료를 계산하는 추상 메소드 선언
	
	public boolean equals(Object obj) {							// 관리번호가 동일한지 확인하는 equals 메소드
		if (obj instanceof Book) {								// 동일 클래스의 객체인지 확인
			Book other = (Book)obj;								// 맞다면 Object를 Book으로 형변환
			if (number == other.number)							// 관리번호 필드가 같다면
				return true;									// true 반환
			else
				return false;									// 다르다면 false 반환
		}
		else 
			return false; 										// 다른 클래스의 객체이면 비교할 필요도 없이 false반환
	}
}

class Novel extends Book{										// Book을 상속받는 Novel 클래스 
	public Novel(String t, String a, int n) {					// Novel의 매개변수 생성자
		super(t, a, n);											// 슈퍼 클래스 생성자 호출
		System.out.println("Novel 생성자");
	}
	public void getLateFees(int day) {							// Book의 getLateFees 메소드 재정의
		int fee;
		fee = 300 * day;
		System.out.println("Novel " + day + "일 연체료는 " + fee + "원 입니다.");
	}
}

class Poet extends Book{										// Book을 상속받는 Poet 클래스 
	public Poet(String t, String a, int n) {					// Poet의 매개변수 생성자
		super(t, a, n);											// 슈퍼 클래스 생성자 호출
		System.out.println("Poet 생성자");
	}	
	public void getLateFees(int day) {							// Book의 getLateFees 메소드 재정의
		int fee;
		fee = 200 * day;
		System.out.println("Poet " + day + "일 연체료는 " + fee + "원 입니다.");
	}
}

class ScienceFiction extends Book{								// Book을 상속받는 ScienceFiction 클래스 
	public ScienceFiction(String t, String a, int n) {			// ScienceFiction의 매개변수 생성자
		super(t, a, n);											// 슈퍼 클래스 생성자 호출
		System.out.println("ScienceFiction 생성자");
	}
	public void getLateFees(int day) {							// Book의 getLateFees 메소드 재정의
		int fee;
		fee = 600 * day;
		System.out.println("ScienceFiction " + day + "일 연체료는 " + fee + "원 입니다.");
	}
}


public class P297_No6_BookTest {

	public static void main(String[] args) {
		Novel b1 = new Novel("N", "Lee", 33);
		Poet b2 = new Poet("P", "Park", 42);
		ScienceFiction b3 = new ScienceFiction("S", "Jung", 21);
		Poet b4 = new Poet("X", "Choi", 33);					// 각 서브 클래스들의 객체 생성과 초기화
		
		System.out.println();
		b1.getLateFees(4);										// 각 객체에 해당하는  getLateFees 메소드를
		b2.getLateFees(8);										// 호출하여 연체료 계산
		b3.getLateFees(2);
		System.out.println();
		
		System.out.println("P과 S는 같은 책인가? " + b2.equals(b3));		// equals 메소드를 호출하여 
		System.out.println("N과 X는 같은 책인가? " + b1.equals(b4));		// 두 책이 관리번호가 같은 책인지 확인
		
		b3.setNumber(42);											// 관리번호 필드의 설정자를 통해 관리번호 변경
		System.out.println("P과 S는 같은 책인가? " + b2.equals(b3));		// equals 메소드 호출
	}
}
