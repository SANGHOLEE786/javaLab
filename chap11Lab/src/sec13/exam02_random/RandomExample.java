package sec13.exam02_random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] selectNumber = new int[6];
		Random random = new Random(4); // seed �õ带 ���س����� �����ӿ��� �ұ��ϰ� �׻� �Ȱ��� ���� ���´�. ����otp�� �̷������� �Ǿ��ִ�.
		System.out.println("���� ��ȣ : ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.println(selectNumber[i]+"");
		
		}
		
		//��÷��ȣ
		int[]winningNumber = new int[6];
		random = new Random(5);
		System.out.println("��÷��ȣ");
		for (int i = 0; i <6; i++) {
		//(int)(Math.random()*45)+1
			winningNumber[i]=random.nextInt(45)+1; //1~45������ ������ ����
		System.out.println(winningNumber[i]+"");
		}
		
		
	}

}
