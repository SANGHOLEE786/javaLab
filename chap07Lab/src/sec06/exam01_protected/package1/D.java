package sec06.exam01_protected.package1;

import sec06.exam01_protected.package2.A;

public class D extends A{

	public D() {   //자식 클래스
		super();  //부모생성자 호출  
		
		this.field = "value";  //protected는 자식클래스에서 접근을 허용한다.
		this.method();
		
		
	}
	
	
	
	
	
	
	
}
