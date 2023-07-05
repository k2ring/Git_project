package chapter09;

public class Exercise9_5 {

	public static void main(String[] args) {

		System.out.println(count("12345AB12AB345AB", "AB"));
		System.out.println(count("12345", "AB"));

	}

	static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치

		

		while (true) {
			pos = src.indexOf(target, pos);
//			System.out.println("찾기 시작할 위치" + pos);
			if (pos != -1) {
				count++;
				pos = pos + target.length();
			} else {
				break;
			}
		}

		return count;
	}

}
