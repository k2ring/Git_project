package arrayEx;

import java.io.CharArrayReader;

public class ArrayCopyEx {

	public static void main(String[] args) {
		
		char arr[]= {'J','A','V','A'};
		
		//배열 복사
		
		//복사할 새로운 배열 선언해놈
		char arr2[]= new char[arr.length];
		
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		
//		System.out.println(arr2.toString());
		
		System.out.println(arr2);
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]);
		}
		

	}

}
