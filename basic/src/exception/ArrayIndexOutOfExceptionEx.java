package exception;

public class ArrayIndexOutOfExceptionEx {

	public static void main(String[] args) {
		
		//배열 예제를 치시고 ArrayIndexOutOfException 가 발생하도록 하시고 예외처리 해보세요!!! 4분

		
		int arr[]=new int[3];
		arr[0]=1;
		arr[1]=1;
		arr[2]=1;
		
		
		
		
		
		try {
			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("방의 갯수 초과");
		}
		
	}

}
