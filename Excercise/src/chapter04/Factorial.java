package chapter04;

//재귀(자기 함수를 부르는 방식) 함수
public class Factorial {

	public static void main(String[] args) {

		int res=fact(7);
		System.out.println(res);
	}

// 마지막이 있는 경우(기저조건이 있는 경우 )
	static int fact(int n) {

		if (n <= 1) {
			return 1;
		} else {
			return n * fact(n - 1);
		}

	}

}
