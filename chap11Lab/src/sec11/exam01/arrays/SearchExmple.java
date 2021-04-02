package sec11.exam01.arrays;

import java.util.Arrays;

public class SearchExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores= {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("Ã£´Â ÀÎµ¦½º"+index);
	
		//¹®ÀÚ¿­ °Ë»ö
		String [] names = {"È«±æµ¿", "¹Úµ¿¼ö","±è¹Î¼ö"};
		Arrays.sort(names);
	
	
	}

}
