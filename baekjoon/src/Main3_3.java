import java.util.Scanner;

public class Main3_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int tot = 0;
		for (int i = 1; i <= N; i++) {
			tot = tot + i;
		}
		System.out.println(tot);			
	}
}