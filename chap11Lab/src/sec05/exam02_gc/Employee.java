package sec05.exam02_gc;

public class Employee {

	//필드
	public int eno;

	//생성자
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee메모리가 생성됨"+("+eno+"));
	}
	
	
	
}
