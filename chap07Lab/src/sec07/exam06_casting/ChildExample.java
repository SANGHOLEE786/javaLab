package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child(); //자동형변환, 부모형<-자식형
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		//참조 영역의 축소
		//parent.field2;
		//parent.method3();
		
		
		Child child =(Child) parent; // 강제형변환, 자식형<- 부모형
		//참조영역의 확대
		child.field2 ="yy";
		child.method3();
		
		
		
		
		
		
		
	}
}
