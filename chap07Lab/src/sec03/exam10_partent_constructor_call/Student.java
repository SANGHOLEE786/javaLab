package sec03.exam10_partent_constructor_call;

public class Student extends People {
	public int studentNo;
	
	
	public Student (String name, String ssn, int studentNo) {
		super(name, ssn);  // �θ�����ڸ� ��������� ����Ͽ��� �Ѵ�.
		this.studentNo = studentNo;
	}
	
	
	
	
	
	
	
}
