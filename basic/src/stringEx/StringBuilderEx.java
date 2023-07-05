package stringEx;

public class StringBuilderEx {

	public static void main(String[] args) {
	
		// 메모리 낭비 막기 위해 StringBuilder 사용
		
		StringBuilder builder	= new StringBuilder();
//		System.out.println(builder);
		
		builder.append("Java ");
		
		builder.append("Program");
		
		System.out.println(builder);
		
		
		StringBuffer builder2	= new StringBuffer();
//		System.out.println(builder);
		
		builder2.append("Java ");
		
		builder2.append("Program");
		
		System.out.println(builder2);
		
	}

}
