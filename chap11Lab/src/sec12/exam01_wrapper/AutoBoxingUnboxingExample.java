package sec12.exam01_wrapper;

public class AutoBoxingUnboxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Auto-Boxing
		Integer obj = 100;
		System.out.println("Value : "+obj.intValue());
		
		//Auto-Unboxing
		int value = obj;
		System.out.println("value : "+value);
		
		//����� Auto-Unboxing
		int result = obj + 100;
		System.out.println("result : "+result);
		
	}

}
