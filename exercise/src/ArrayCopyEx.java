public class ArrayCopyEx {

	public static void main(String[] args) {

		char arr[] = {'J','A','V','A'};		// char는 반복문 없이 출력가능
		System.out.println(arr);
		
		int arr1[] = {1,2,3,4};
		System.out.println(arr1);
		
		String arr2[] = {"ab","bc","cd","de"};
		System.out.println(arr2);
		
		//배열 복사

		// 복사할 새로운 배열 선언해놓음
//		char arr2[] = new char[arr.length];
//		
//		System.arraycopy(arr, 0, arr2, 0, arr.length);
//		
//		
//		for (char i : arr2) {
//			System.out.println(i);
//		}
//		
//		System.out.println(arr2);
	}
}
