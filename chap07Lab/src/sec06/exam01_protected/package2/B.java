package sec06.exam01_protected.package2;

public class B {

		public void method() {
			
			A a = new A(); // protected는 같은 패키지 내에서 접근이 가능하다.  호출
			a.field ="value";
			a.method();
		
		
		}
	
	
	
	
	
	
	
}
