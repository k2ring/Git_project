package chapter04;

import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {
		// 컴퓨터에서 발생하는 숫자 answer
//		for(int i=0;i<10000;i++) {
//			System.out.println((int)(Math.random()*100) +1);	
//		}

		int count = 0;

		// 1.answer

		int answer = (int) (Math.random() * 100) + 1;
		System.out.println("정답 : " + answer);

		// 2.입력 Scanner //입력스트림
		Scanner sc = new Scanner(System.in);

//		String str=sc.next();		
//		System.out.println(str);

		int input = 0;

		do {
			count++;
			System.out.print("숫자 넣어보세요");
			input = sc.nextInt();
//			System.out.println(input);

			if (answer > input) {
				System.out.println("당신이 입력한 숫자는 정답보다 작다.");
			} else if (answer < input) {
				System.out.println("당신이 입력한 숫자는 정답보다 크다.");
			} else {
				System.out.println("정답");
				break;
			}

			System.out.println("시도횟수:" + count);
		} while (true);

	}
}
