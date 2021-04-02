package sec11.exam01.arrays;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int [][]original = {{1,2},{3,4}}; 
	//얇은 복사 후 비교
			
	int[][]cloned1 = Arrays.copyOf(original, original.length); // 얅은 복사
	System.out.println("배열 번지비교"+original.equals(cloned1)); //false
	System.out.println("1차 배열 항목값 비교"+original); //true
	System.out.println("중첩배열값비교"+Arrays.deepEquals(original, cloned1)); // true
	
	
	
	}

}
