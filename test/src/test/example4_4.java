package test;

public class example4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1+(-2)+3+(-4)+... �� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���ϱ�. //199
		
		// sum : �հ� ����
		// i : �ݺ���
		// s : ��ȣ ����Ī ����(1,-1)
		// num : i*s(���� ���� ���� ����)
		//100�̻� : sum >= 100
		int sum = 0;
		int s =1;
		int num =0;

		for (int i=1; sum<100; i++) { 
			num =i*s;
			// s *= -1;
			s = -s;
		 	sum += num;
	}
		System.out.println(s);				
		System.out.println("num: "+num);
		System.out.println("sum: "+sum);
	
		/*
		  int sum =0;
		  int s=-1
		  int num =0;
		  
		  for(int i =1; int i <100; i++) {
		  
		  	int num = i*s;
		  	s = -s;
		  	sum += num;
		  	
		  }
		  
		 */
		
	}

}
