import java.util.Scanner;

public class Main2_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int prize;
		
		if (n1 == n2 && n2 == n3 && n1 == n3) {
			prize = 10000 + (n1 * 1000);

		} else if (n1 == n2 || n1 == n3 || n2 == n3) {
			if (n1 == n2) {
				prize = 1000 + (n1 * 100);
			} else if (n2 == n3) {
				prize = 1000 + (n2 * 100);
			} else {
				prize = 1000 + (n3 * 100);
			}

		} else {
			if (n1 > n2 && n1 > n3) {
				prize = n1 * 100;
			} else if (n2 > n1 && n2 > n3) {
				prize = n2 * 100;
			} else {
				prize = n3 * 100;
			}
		}
		System.out.println(prize);
	}
}