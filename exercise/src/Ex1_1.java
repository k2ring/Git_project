
public class Ex1_1 {

	public static void main(String[] args) {
//		byte arr[] = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };	
//	  				  H   e    l    l    o    sp  J   a   v    a
//		String str1 = new String(arr);
//			System.out.println(str1);
			
		byte arr2[] = {73, 32, 119, 97, 110, 116, 32, 116, 111, 32, 112, 108, 97, 121, 32, 76, 79, 76 };
		
		String str2 = new String(arr2);
		System.out.println(str2);
		System.out.println(str2);
		
		// 메모리 낭비 막기 위해 StringBuilder 사용
		StringBuilder builder = new StringBuilder();
		System.out.println(builder);
		
		builder.append("Java");
		builder.append("Program");
		
		System.out.println(builder);
	}

}
