package sec11.exam01.arrays;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int [][]original = {{1,2},{3,4}}; 
	//���� ���� �� ��
			
	int[][]cloned1 = Arrays.copyOf(original, original.length); // ���� ����
	System.out.println("�迭 ������"+original.equals(cloned1)); //false
	System.out.println("1�� �迭 �׸� ��"+original); //true
	System.out.println("��ø�迭����"+Arrays.deepEquals(original, cloned1)); // true
	
	
	
	}

}
