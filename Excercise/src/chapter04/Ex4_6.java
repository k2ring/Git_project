package chapter04;

public class Ex4_6 {

	public static void main(String[] args) {

//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=6;j++) {
//				if(i+j==6) {
//					System.out.println("(" + i + "," + j + ")");
//				}
//				
//			}
//		}

//		//난수표를 이용한 숫자: 난수
//		
////		Math.random()   //값의 범위는  0<= 값 <1
//		//1부터 ~6까지

//		for(int i=0;i<100;i++) {
//			System.out.println((int)(Math.random()*6)+1);	
//		}

//		System.out.println((int)(Math.random()*6)+1);

		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.println("(" + x + "," + y + ")");
				}

			}
		}

	}

}
