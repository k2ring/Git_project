import java.util.Scanner;

public class Main2_6 {

	static Scanner sc = new Scanner(System.in);
	static int hour = +sc.nextInt();
	static int min = +sc.nextInt();
	static int next = +sc.nextInt();
	static int min2 = min + next;
	static int min2_val = (min + next) / 60;
	static int a = hour + min2_val;

	public static void hour2() {
		if (a >= 24) {
			hour = a - 24;
		} else {
			hour = a;
		}
	}

	public static void main(String[] args) {

		if (min2 >= 60) {
			hour2();
			min = (min2) % 60;
		} else {
			hour2();
			min = min2;
		}
		System.out.println(hour + " " + min);
	}

}