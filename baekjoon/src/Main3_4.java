import java.util.Scanner;

public class Main3_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int all = sc.nextInt();
		int n = sc.nextInt();
		int A, B;
		int sum = 0;
		int tot = 0;

		for (int i = 1; i <= n; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			sum = A * B;
			tot += sum;
		}

		if (all == tot) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
