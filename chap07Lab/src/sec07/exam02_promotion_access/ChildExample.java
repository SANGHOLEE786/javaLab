package sec07.exam02_promotion_access;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent = child; // �ڵ�����ȯ, �θ���<-�ڽ���
		
		child.method1(); //�θ��� ��
		child.method2(); //
					 	 // �ڵ�Ÿ�Ժ�ȯ�� �θ𿡰� ���� �κ��� �������������� ��ҵȴ�. 
		
		parent.method1();
		parent.method2();
		parent.method3(); //x  
		
		
 		
		
	}

}