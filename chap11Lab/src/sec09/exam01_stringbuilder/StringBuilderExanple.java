package sec09.exam01_stringbuilder;

public class StringBuilderExanple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java");
		sb.append("Progam Study");
		System.out.println(sb.toString());
	
		sb.insert(4, "2");
		System.out.println(sb.toString());
				
		
		
	}

}
