package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {


	public static void main (String[]arg) {
		//Key 객체를 식별키로 사용해서 String 값울 저장하는 HashMap 객체 생성
		// 프로그램 = 자료구조+알고리즘
		//Map자료구조 : 
	HashMap<Key,String>hashmap = new HashMap<Key,String>();

	//식별키 "new Key(1)"로 "홍길동"을 저장함.
	hashmap.put(new Key(1), "홍길동");
	
	//식별키 "new Key(1)"로 "홍길동"을 읽어옴.
	String value =hashmap.get(new Key(1));
	System.out.println(value);
	
	}
	
}
