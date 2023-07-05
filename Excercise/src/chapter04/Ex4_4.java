package chapter04;

public class Ex4_4 {

	public static void main(String[] args) {

		int i = 1;
		int tot = 0;
		int sign = -1;
		while (i < 300) {

			sign = (-1 * sign);
			tot = tot + i * sign;
//			System.out.println(i);
//			System.out.println(sign);
//			System.out.println(tot);
			if (tot >= 100) {
				break;

			}
			i++;
		}
		System.out.println(i);
	}
}
