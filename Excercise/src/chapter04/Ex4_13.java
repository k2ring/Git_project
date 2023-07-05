package chapter04;

public class Ex4_13 {

	public static void main(String[] args) {

		String value = "123p34";
		char ch = ' ';
		boolean isNumber = true;

		for (int i = 0; i < value.length(); i++) {
//			System.out.println(value.charAt(i));
			ch = value.charAt(i);
			if (!(ch >= '0' && ch <= '9')) {
				isNumber = false;
				break;
			}

		}

		if (isNumber) {
			System.out.println("숫자입니다");
		} else {
			System.out.println("숫자가 아닙니다");
		}

	}

}
