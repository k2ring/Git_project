package chapter09;

public class Exercise9_11 {

	public static void main(String[] args) {

		try {
			if (args.length != 2) {
//				System.exit(0);
				System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해 주세요.");
				System.out.println("USAGE : GugudanTest 3 5");
			}
		}catch(Exception e) {
			System.out.println("인덱스 범위 벗어남");
		}
		
		

		String first = args[0];

		String second = args[1];

		int firstInt = Integer.parseInt(first);
		int secondInt = Integer.parseInt(second);

		System.out.print("첫번째 수" + firstInt);
		System.out.print("두번째 수" + secondInt);
		System.out.println();

		for (int i = firstInt; i <= secondInt; i++) {
//			System.out.println(i);

			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + " = " + i * j);
			}
			
			System.out.println("-------");
		}

	}

}
