package lec602;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int answer = (int)(Math.random() *100) + 1;
		int input = 0;
		int count = 0;

		Scanner s = new Scanner(System.in);
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 :");
			input = s.nextInt();

			if (input == answer) {
				System.out.printf("맞췄습니다\n시도횟수는 %d번 입니다.", count);
				s.close();
				break;
			} else if (input > answer) {
				System.out.println("더 작은 수를 입력하세요");
			} else if (input < answer) {
				System.out.println("더 큰 수를 입력하세요");
			}
		} while (true);

	}

}
