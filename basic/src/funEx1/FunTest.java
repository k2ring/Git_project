package funEx1;

public class FunTest {

	// static 정적(클래스가 있는 영역에 고정)
	// 1
	static void give1() {
		System.out.println("hi");
	}

	// 2
	static void give2(String gift) {
		System.out.println(gift);
	}

	// 3
	static String give3() {
		return "사탕";
	}

	// 4
	static String give4(String gift) {
		System.out.println(gift + "받아라");
		return "사탕";
	}

	public static void main(String[] args) {
//		give1();
//		give2("초코");
//		String gift=give3();
//		System.out.println(gift);

		String gift = give4("초코");

		System.out.println(gift);

	}

}
