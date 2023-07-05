package chapter05;

public class Exercise5_3 {

	public static void main(String[] args) {
		
			int[] arr = {10, 20, 30, 40, 50};
			int tot=0;
			for(int i=0;i<arr.length;i++) {
//				System.out.println(arr[i]);
				tot=tot + arr[i];
			}
			
			System.out.println(tot);
			

	}

}
