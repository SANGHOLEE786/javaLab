package test;

public class example3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =2;
		int y =5;
		char c = 'A'; // A의 문자코드는 65
		
		
		System.out.println(1+x<<33);                     //6     ** int는 32bit이므로 33번 쉬프트하지않고 1번만 쉬프트한다. ?
		System.out.println(y>=5 || x <0 && x > 2);    //true
		System.out.println(y+=10 -x++);                 //13
		System.out.println(x+=2);                          //5
		System.out.println(!('A'<=c && c <='Z'));      //false
		System.out.println('C'-c);                          //2
		System.out.println('5'-'0');                         //5
		System.out.println(c+1);                           //66
		System.out.println(++c);                          //B 
		System.out.println(c++);                          //B
		System.out.println(c);                              //C
	
		
	
	}

}
