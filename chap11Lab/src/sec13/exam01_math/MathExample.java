package sec13.exam01_math;

public class MathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = Math.abs(-5);
		double v2 = Math.abs("v1="+v1);
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3="+v3); //6.0
		System.out.println("v4="+v4); //-5.0
		
		double v11 = Math.random(); //0.0<= Math.random()<1.0������ �Ǽ���
		System.out.println("v11="+v11);
		
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14="+v14);
		System.out.println("v15="+v15);
	}

}
