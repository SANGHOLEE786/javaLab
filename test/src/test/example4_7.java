package test;

public class example4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ڷ� �̷���� ���ڿ� str�� ���� ��,
		//�� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��ϱ�. ���� ���ڿ��� "12345"���, '1+2+3+4+5'�� ����� 15�� ��µǾ�� �Ѵ�.

		String str ="12345";
		int sum=0;

		for (int i=0; i <str.length(); i++) {
		
			int c = str.charAt(i) - 48;
			System.out.println("c=" + c);
			sum += c;

		};

		System.out.println("sum="+sum);
		
	}

}
