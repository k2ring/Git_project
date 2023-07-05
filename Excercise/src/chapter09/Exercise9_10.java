package chapter09;

public class Exercise9_10 {

	static String format(String str, int length, int alignment) {
		//    length 7, str.length() 3
		
		//    int chai= length - str.lengh()
		
		int chai= length - str.length();
		char arr[];
		
		char [] source=str.toCharArray();
		char [] result=new char[length];
		
		if(chai<0) {
			return str.substring(0, length);
		}else {
			arr= new char[length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = ' ';
			}
			if (alignment == 0) {
				System.arraycopy(source, 0, result, 0, source.length);

			} else if (alignment == 1) {
				System.arraycopy(source, 0, result,chai/2, source.length);
			} else if (alignment == 2) {
				System.arraycopy(source, 0, result,chai, source.length);
			}

			return new String(result);
		}	


		
	}

	public static void main(String[] args) {

		String str = "가나다";

//		System.out.println(str.length());
		
		System.out.println(format(str, 7, 0)); // 왼쪽 정렬
		System.out.println(format(str, 7, 1)); // 왼쪽 정렬
		System.out.println(format(str, 7, 2)); // 왼쪽 정렬

	}

}
