package sec04.exam01_overriding;

public class Computer extends Calculator {

	//메소드 재정의 (method overriding)  ★많이 사용한다. 중요 ★
	//어노테이션 : 컴파일러에게 코드(재정의 여부) 검증을 요청한다.
	@Override
	double areaCircle(double r) {
		
		//return 3.14159 * r*r
		System.out.println("Computer객체의 areaCircle()실행");
		return Math.PI * r *r;
	
	
	}
	
	
		
	
	
}
