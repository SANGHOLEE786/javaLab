package sec06.exam01_protected.package2;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A<-B<-D, A<-C<-E  
		
		
		B b = new B(); // B타입의 객체
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; //자동형변환, 부모형 <-자식형
		A a2 = c; //자동형변화
		A a3 = d; //자동형변화
		A a4 = e; //자동형변화
		
		
		
	}

}
