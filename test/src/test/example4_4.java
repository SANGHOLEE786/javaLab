package test;

public class example4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하기. //199
		
		// sum : 합계 저장
		// i : 반복문
		// s : 부호 스위칭 변수(1,-1)
		// num : i*s(더할 값을 구할 변수)
		//100이상 : sum >= 100
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
