package chapter03;

public class Ex3_2 {

	public static void main(String[] args) {
		int numOfApples = 120; // 사과의 개수
		int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수

//		System.out.println(numOfApples / sizeOfBucket) ;
		
		int numOfBucket =  numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1  :  0);
		
		
		System.out.println(numOfBucket);
		
		
		// 삼항 연산자
		
//		System.out.println( false ?  "a": false? "b" :  "c" );
		
//		System.out.println(numOfApples % sizeOfBucket > 0 ? 1  :  0);
		
		
		
	}

}
