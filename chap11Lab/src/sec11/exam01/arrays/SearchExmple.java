package sec11.exam01.arrays;

import java.util.Arrays;

public class SearchExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores= {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���"+index);
	
		//���ڿ� �˻�
		String [] names = {"ȫ�浿", "�ڵ���","��μ�"};
		Arrays.sort(names);
	
	
	}

}
