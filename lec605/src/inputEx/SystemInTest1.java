package inputEx;

import java.util.Scanner;

public class SystemInTest1 {
	
	public static void main(String[] args) {

//		System.err.print("Hi");
		
		
		// 한 글자 읽는 법 read, 한글자 한글 읽는 법 Scanner, 한 줄은 nextLine
		try {
//			int i = System.in.read();	// 입력 스트림에서 다음 바이트의 데이터를 읽습니다.
//			System.out.println(i);		// 첫번째 입력값만 출력됨 (Aalrhgaiga해도 A만 나옴)
//			System.out.println((char)i);
			
			Scanner sc = new Scanner(System.in);
			String oneKor = sc.next();
			System.out.println(oneKor);
			
//			Scanner sc = new Scanner(System.in);
//			String oneLineKor = sc.nextLine();
//			System.out.println(oneLineKor);
			
			sc.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
