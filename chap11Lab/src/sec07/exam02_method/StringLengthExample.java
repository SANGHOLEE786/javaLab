package sec07.exam02_method;

public class StringLengthExample {

	public static void main(String[]args) {
		
		int[] ints = new int[3];
		System.out.println("ints.length: "+ints.length);
		
		
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length==13) {
			System.out.println("주민번호 자리수가맞습니다.");
		}else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
		
	}
}
