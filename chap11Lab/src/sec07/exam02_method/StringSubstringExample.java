package sec07.exam02_method;

public class StringSubstringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
	
		String SecondNum = ssn.substring(7, 13);
		System.out.println(SecondNum);
	
	}

}
