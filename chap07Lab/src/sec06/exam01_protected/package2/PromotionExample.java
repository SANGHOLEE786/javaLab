package sec06.exam01_protected.package2;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A<-B<-D, A<-C<-E  
		
		
		B b = new B(); // BŸ���� ��ü
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; //�ڵ�����ȯ, �θ��� <-�ڽ���
		A a2 = c; //�ڵ�����ȭ
		A a3 = d; //�ڵ�����ȭ
		A a4 = e; //�ڵ�����ȭ
		
		
		
	}

}
