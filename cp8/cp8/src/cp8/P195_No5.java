package cp8;

class Employee {
	private String name;								// 이름, 전화번호, 연봉 필드
	private String number;								// private로 선언
	private int salary;
	
	public String getName() { return name; }			// name에 대한 접근자 메소드
	public void setName(String n) { name = n; }			// name에 대한 설정자 메소드
	
	public String getNumber() { return number; }
	public void setNumber(String m) { number = m; }
	
	public int getSalary() { return salary; }
	public void setSalary(int s) { salary = s; }
	
	public String toString() {							// 객체 출력시 호출되는 메소드
		return "직원 이름: " + name + "\n직원 전화번호: " + number + "\n직원 연봉: " + salary;
	}
	public boolean equals(Employee b) {					// 객체의 내용이 같은지 확인하는 메소드
		if (name == b.name && number == b.number && salary == b.salary)
			return true;								// 모두 같으면 true 반환
		else
			return false;								// 하나라도 틀리면 false 반환
	}
}

public class P195_No5 {										// EmployeeTest 클래스

	public static void main(String[] args) {
		Employee em1 = new Employee();						// Employee클래스의 객체 em1 생성
		//em1.name("Hong");										private필드이므로 Employee클래스 밖에서 직접접근 불가
		em1.setName("Hong");								// 설정자를 통해  필드 접근
		em1.setNumber("010-1234-5678");
		em1.setSalary(500);
		
		// System.out.println("직원 이름: " + em1.name);		private필드이므로 밖에서 접근 불가
		System.out.println("직원 이름: " + em1.getName());		// 접근자를 통해 필드 출력
		System.out.println(em1);							// toString 메소드 호출해 em1의 필드 출력
		System.out.println();
		
		Employee em2 = new Employee();						// Employee클래스의 객체 em2 생성
		//em2.Salary(300);										private필드이므로 Employee클래스 밖에서 직접접근 불가
		em2.setName("Choi");								// 설정자를 통해  필드 접근
		em2.setNumber("010-9876-5432");
		em2.setSalary(300);
		
		//System.out.println("직원 연봉: " + em2.salary);		private필드이므로 밖에서 접근 불가
		System.out.println("직원 연봉: " + em2.getSalary());	// 접근자를 통해 필드 출력
		System.out.println(em2);
		System.out.println();
		
		System.out.println(em1.equals(em2));				// equals 메소드 호출
		em2 = em1;											// em2가 em1 참조
		System.out.println(em1.equals(em2));
	}
}
