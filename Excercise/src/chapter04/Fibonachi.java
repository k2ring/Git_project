package chapter04;

public class Fibonachi {

	public static void main(String[] args) {
		int input = 10;
		for (int i = 1; i <= input; i++) {
			System.out.print(fibo(i)+ " ");
		}

	}

	static int fibo(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibo(n - 2) + fibo(n - 1);
		}

	}
}
