package chapter09;

public class Exercise9_7 {

	static boolean contains(String src, String target) {
		
		boolean result= src.indexOf(target) != -1;
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
//		System.out.println("12345".indexOf(""));
		System.out.println(contains("12345","23"));
		System.out.println(contains("12345","67"));

	}

}
