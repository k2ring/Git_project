package chapter06;

public class Exercise6_6 {

	static double getDistance(int x, int y, int x1, int y1) {
		
		 double res1= (double) ((x1 - x)*(x1 - x) + (y1 - y)*(y1 - y));
		 
		 double res2=Math.sqrt(res1);
		
		return res2;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
//		System.out.println(Math.sqrt(25.0));

	}
	
	

}
