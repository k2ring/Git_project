
public class ForEx1 {

	public static void main(String[] args) {
		// 1부터 10까지 찍기

//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//			}

		// 1 + 2 + 3 + ... +10 : 누적합 구하기

//		int tot = 0;
//		for (int i = 1; i <= 10; i++) {
//			tot = tot + i; // tot += i;
//		}

//		System.out.println(tot);

		// 1부터 100사이 홀수 찍기  // 2로 나누었을 때 나머지가 0,1
//		int tot = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2  == 1 ) {
////				System.out.println(i);
//				tot=tot + i;
//			}
//		}
		
//		System.out.println(tot);

		// 1부터 100사이 3의 배수 누적합 구하기

		
		int tot = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3  == 0 ) {
//				System.out.println(i);
				tot=tot + i;
			}
		}
		
//		System.out.println(tot);

		// 구구단 찍기
		// 2단   2 - 9
		// 1 ~ 9 
		// 행과 열이 있는 형태는 표(2차원, 사각형, 테이블)
		
//		for(int i=2;i<=9;i++) { // 행
//			for(int j=1;j<=9;j++) {  //열
//				System.out.print(i + " * " + j + " = " + i*j + "    ") ;
//			}
//			System.out.println();
//		}
		
		// 4x+5y=60의 모든 해를 구해서 (x,y) 형태로 출력, 단 x와 y는 10이하의 자연수
		
		for(int x=1;x<=10;x++) {   //x
			for(int y=1;y<=10;y++) {   //y
			 // 4*x + 5*y == 60	
				if(4*x + 5*y == 60) {
					System.out.print("(" +x +","+ y + ")   " );	
				}
				
				
			}  
		}
		
		

	}

}
