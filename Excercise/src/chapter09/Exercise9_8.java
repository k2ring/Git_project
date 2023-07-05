package chapter09;

public class Exercise9_8 {

	
	static double  round(double d, int i){
		
		
		double result=  (Math.round(  d*Math.pow(10, i))  /  Math.pow(10, i) );
		
		return result;		
	}
	
	public static void main(String[] args) {
		System.out.println(round(3.1415,1));
		System.out.println(round(3.1415,2));
		
//		System.out.println(Math.pow(2,3));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));

	}

}
