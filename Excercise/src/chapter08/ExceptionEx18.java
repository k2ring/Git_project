package chapter08;

public class ExceptionEx18 {
	public static void main(String[] args) {

		method1();

		

	}

	static void method1() {
		method2();
	}

	static void method2() {
		System.out.println(3 / 0);
	}

}
