package sec06.exam01_protected.package1;

import sec06.exam01_protected.package2.A;

public class D extends A{

	public D() {   //�ڽ� Ŭ����
		super();  //�θ������ ȣ��  
		
		this.field = "value";  //protected�� �ڽ�Ŭ�������� ������ ����Ѵ�.
		this.method();
		
		
	}
	
	
	
	
	
	
	
}
