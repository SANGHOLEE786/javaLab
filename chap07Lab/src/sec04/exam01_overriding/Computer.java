package sec04.exam01_overriding;

public class Computer extends Calculator {

	//�޼ҵ� ������ (method overriding)  �ڸ��� ����Ѵ�. �߿� ��
	//������̼� : �����Ϸ����� �ڵ�(������ ����) ������ ��û�Ѵ�.
	@Override
	double areaCircle(double r) {
		
		//return 3.14159 * r*r
		System.out.println("Computer��ü�� areaCircle()����");
		return Math.PI * r *r;
	
	
	}
	
	
		
	
	
}
