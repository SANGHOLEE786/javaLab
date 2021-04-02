package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent = child; // 자동형변환, 부모형<-자식형
		
		child.method1(); //부모의 것
		child.method2(); //
					 	 // 자동타입변환시 부모에게 없는 부분은 참ㅇㅇ조영역이 축소된다. 
		
		parent.method1();
		parent.method2();
		parent.method3(); //x  
		
		
 		
		
	}

}
