package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {


	public static void main (String[]arg) {
		//Key ��ü�� �ĺ�Ű�� ����ؼ� String ���� �����ϴ� HashMap ��ü ����
		// ���α׷� = �ڷᱸ��+�˰���
		//Map�ڷᱸ�� : 
	HashMap<Key,String>hashmap = new HashMap<Key,String>();

	//�ĺ�Ű "new Key(1)"�� "ȫ�浿"�� ������.
	hashmap.put(new Key(1), "ȫ�浿");
	
	//�ĺ�Ű "new Key(1)"�� "ȫ�浿"�� �о��.
	String value =hashmap.get(new Key(1));
	System.out.println(value);
	
	}
	
}
