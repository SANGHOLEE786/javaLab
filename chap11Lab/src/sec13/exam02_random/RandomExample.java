package sec13.exam02_random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] selectNumber = new int[6];
		Random random = new Random(4); // seed 시드를 정해놓으면 랜덤임에도 불구하고 항상 똑같은 값이 나온다. 은행otp가 이런식으로 되어있다.
		System.out.println("선택 번호 : ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.println(selectNumber[i]+"");
		
		}
		
		//당첨번호
		int[]winningNumber = new int[6];
		random = new Random(5);
		System.out.println("당첨번호");
		for (int i = 0; i <6; i++) {
		//(int)(Math.random()*45)+1
			winningNumber[i]=random.nextInt(45)+1; //1~45사이의 임의의 정수
		System.out.println(winningNumber[i]+"");
		}
		
		
	}

}
