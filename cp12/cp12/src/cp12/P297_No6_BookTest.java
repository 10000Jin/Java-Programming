package cp12;

abstract class Book{											// �߻� Ŭ���� Book ����
	private String title;										// ����, �۰�, ������ȣ �ʵ�
	private String auther;										// private�� ����
	private int number;
	
	public Book(String t, String a, int n) {					// Book�� �Ű����� ������
		title = t;
		auther = a;
		number = n;
		System.out.println("Book ������");
	}
	
	public String getTitle() { return title; }					// �� �ʵ���� ������
	public String getAuther() { return auther; }
	public int getNumber() { return number; }
	public void setTitle(String t) { title = t; }				// �� �ʵ���� ������
	public void setAuther(String a) { auther = a; }
	public void setNumber(int n) {number = n;}
	
	public abstract void getLateFees(int day);					// ��ü�Ḧ ����ϴ� �߻� �޼ҵ� ����
	
	public boolean equals(Object obj) {							// ������ȣ�� �������� Ȯ���ϴ� equals �޼ҵ�
		if (obj instanceof Book) {								// ���� Ŭ������ ��ü���� Ȯ��
			Book other = (Book)obj;								// �´ٸ� Object�� Book���� ����ȯ
			if (number == other.number)							// ������ȣ �ʵ尡 ���ٸ�
				return true;									// true ��ȯ
			else
				return false;									// �ٸ��ٸ� false ��ȯ
		}
		else 
			return false; 										// �ٸ� Ŭ������ ��ü�̸� ���� �ʿ䵵 ���� false��ȯ
	}
}

class Novel extends Book{										// Book�� ��ӹ޴� Novel Ŭ���� 
	public Novel(String t, String a, int n) {					// Novel�� �Ű����� ������
		super(t, a, n);											// ���� Ŭ���� ������ ȣ��
		System.out.println("Novel ������");
	}
	public void getLateFees(int day) {							// Book�� getLateFees �޼ҵ� ������
		int fee;
		fee = 300 * day;
		System.out.println("Novel " + day + "�� ��ü��� " + fee + "�� �Դϴ�.");
	}
}

class Poet extends Book{										// Book�� ��ӹ޴� Poet Ŭ���� 
	public Poet(String t, String a, int n) {					// Poet�� �Ű����� ������
		super(t, a, n);											// ���� Ŭ���� ������ ȣ��
		System.out.println("Poet ������");
	}	
	public void getLateFees(int day) {							// Book�� getLateFees �޼ҵ� ������
		int fee;
		fee = 200 * day;
		System.out.println("Poet " + day + "�� ��ü��� " + fee + "�� �Դϴ�.");
	}
}

class ScienceFiction extends Book{								// Book�� ��ӹ޴� ScienceFiction Ŭ���� 
	public ScienceFiction(String t, String a, int n) {			// ScienceFiction�� �Ű����� ������
		super(t, a, n);											// ���� Ŭ���� ������ ȣ��
		System.out.println("ScienceFiction ������");
	}
	public void getLateFees(int day) {							// Book�� getLateFees �޼ҵ� ������
		int fee;
		fee = 600 * day;
		System.out.println("ScienceFiction " + day + "�� ��ü��� " + fee + "�� �Դϴ�.");
	}
}


public class P297_No6_BookTest {

	public static void main(String[] args) {
		Novel b1 = new Novel("N", "Lee", 33);
		Poet b2 = new Poet("P", "Park", 42);
		ScienceFiction b3 = new ScienceFiction("S", "Jung", 21);
		Poet b4 = new Poet("X", "Choi", 33);					// �� ���� Ŭ�������� ��ü ������ �ʱ�ȭ
		
		System.out.println();
		b1.getLateFees(4);										// �� ��ü�� �ش��ϴ�  getLateFees �޼ҵ带
		b2.getLateFees(8);										// ȣ���Ͽ� ��ü�� ���
		b3.getLateFees(2);
		System.out.println();
		
		System.out.println("P�� S�� ���� å�ΰ�? " + b2.equals(b3));		// equals �޼ҵ带 ȣ���Ͽ� 
		System.out.println("N�� X�� ���� å�ΰ�? " + b1.equals(b4));		// �� å�� ������ȣ�� ���� å���� Ȯ��
		
		b3.setNumber(42);											// ������ȣ �ʵ��� �����ڸ� ���� ������ȣ ����
		System.out.println("P�� S�� ���� å�ΰ�? " + b2.equals(b3));		// equals �޼ҵ� ȣ��
	}
}
