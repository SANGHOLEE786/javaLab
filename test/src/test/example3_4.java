package test;

public class example3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numOfApples = 123; // ����� ���� 
		int sizeOfBucket = 10; // �ٱ����� ũ�� (�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket =    numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);

		System.out.println("�ʿ��� �ٱ����� �� :"+numOfBucket);

	}

}
