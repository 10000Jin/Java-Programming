package cp8;

class Employee {
	private String name;								// �̸�, ��ȭ��ȣ, ���� �ʵ�
	private String number;								// private�� ����
	private int salary;
	
	public String getName() { return name; }			// name�� ���� ������ �޼ҵ�
	public void setName(String n) { name = n; }			// name�� ���� ������ �޼ҵ�
	
	public String getNumber() { return number; }
	public void setNumber(String m) { number = m; }
	
	public int getSalary() { return salary; }
	public void setSalary(int s) { salary = s; }
	
	public String toString() {							// ��ü ��½� ȣ��Ǵ� �޼ҵ�
		return "���� �̸�: " + name + "\n���� ��ȭ��ȣ: " + number + "\n���� ����: " + salary;
	}
	public boolean equals(Employee b) {					// ��ü�� ������ ������ Ȯ���ϴ� �޼ҵ�
		if (name == b.name && number == b.number && salary == b.salary)
			return true;								// ��� ������ true ��ȯ
		else
			return false;								// �ϳ��� Ʋ���� false ��ȯ
	}
}

public class P195_No5 {										// EmployeeTest Ŭ����

	public static void main(String[] args) {
		Employee em1 = new Employee();						// EmployeeŬ������ ��ü em1 ����
		//em1.name("Hong");										private�ʵ��̹Ƿ� EmployeeŬ���� �ۿ��� �������� �Ұ�
		em1.setName("Hong");								// �����ڸ� ����  �ʵ� ����
		em1.setNumber("010-1234-5678");
		em1.setSalary(500);
		
		// System.out.println("���� �̸�: " + em1.name);		private�ʵ��̹Ƿ� �ۿ��� ���� �Ұ�
		System.out.println("���� �̸�: " + em1.getName());		// �����ڸ� ���� �ʵ� ���
		System.out.println(em1);							// toString �޼ҵ� ȣ���� em1�� �ʵ� ���
		System.out.println();
		
		Employee em2 = new Employee();						// EmployeeŬ������ ��ü em2 ����
		//em2.Salary(300);										private�ʵ��̹Ƿ� EmployeeŬ���� �ۿ��� �������� �Ұ�
		em2.setName("Choi");								// �����ڸ� ����  �ʵ� ����
		em2.setNumber("010-9876-5432");
		em2.setSalary(300);
		
		//System.out.println("���� ����: " + em2.salary);		private�ʵ��̹Ƿ� �ۿ��� ���� �Ұ�
		System.out.println("���� ����: " + em2.getSalary());	// �����ڸ� ���� �ʵ� ���
		System.out.println(em2);
		System.out.println();
		
		System.out.println(em1.equals(em2));				// equals �޼ҵ� ȣ��
		em2 = em1;											// em2�� em1 ����
		System.out.println(em1.equals(em2));
	}
}
