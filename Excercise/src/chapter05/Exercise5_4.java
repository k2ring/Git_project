package chapter05;

public class Exercise5_4 {

	public static void main(String[] args) {

		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };

		int tot=0;
		float average = 0;
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
				tot=tot + arr[i][j];
//				System.out.print(arr[i].length);
			}
//			전체 총 갯수
//			System.out.println(arr.length);
			
		}
		
		System.out.println(tot);
		System.out.println(    tot    / (float)(arr.length * arr[0].length) );
	}

}
