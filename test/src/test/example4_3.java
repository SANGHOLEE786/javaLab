package test;

public class example4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과값구하기. //220

		// sum : i값을 누적
		// tatalSum : sum을 계속 누적
		// i 	sum	 	total
		// 1	1            	1
		// 2 	1+2=3		1+3=4=1+(1+2)
		// 3 	1+2+3=6		1+3+6=10=(1+2)+(1+2+3)
		// 4 	1+2+3+4=10 	1+3+6+10=20=1+(1+2)+(1+2+3)+(1+2+3+4)
		int sum =0;
		int totalSum=0;
													
		for (int i=1; i<=10; i++) {
		    sum +=i;
		    totalSum += sum;
		}
		System.out.println(totalSum);
	    }
}
		
		/*
		int num =1;
		int a =num+1;
		for (int i = 1; i <= 10; i++) {
			
			  num=+num+i+a;  //
			//System.out.printf("sum%d",sum);
		}
		
		System.out.println(num);
	}
						// ** c= a+b
						//	  b= a+1
						//    a=1   -> 반복 시 앞의 갚을 어떻게 유지시키면서 합을 더해나갈 것인가?
}
 	*/
//1+3+6+10+15+21+28+36+45+55
