package test;

public class example4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int num = 0;

		  for (int i = 1; i <= 20; i++) {

		   if (i % 2 == 0 || i % 3 == 0) {
		    continue;
		   }
		   num = num + i;
		  }
		  System.out.println(num);
	*/	 
		 /*
		  int num = 0;

		  for (int i = 1; i <= 20; i++) {

		   if (i % 2 != 0 && i % 3 != 0) {

		    num = num + i;
		   }
		  }
		  System.out.println(num);
		*/
		
		// 1부터20까지의 정수 중 2와3의 배수가 아닌 것의 총합 //73
		 
		  int num1 =0;
		  for (int i = 1;  i <=20; i++) {
			  
			  if (i % 2 != 0 && i % 3 != 0) {
			  num1 = num1+i;
			  }
			  }
			  System.out.println(num1);
			//  int a =1 +5+ 7 +11+ 13 +17+19;
		    // System.out.println(a);
			  
		}

	
	// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
	// 1 5 7 11 13  17 19 
	

}
