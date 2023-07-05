package chapter09;

public class Exercise9_12 {

	
//	static int getRand(){
//		return 0;
//	}
	
	
	static int getRand(int from,int to){
		int res =   (int)(Math.random()* (Math.abs(from-to)+1))    + Math.min(to, from);
		
	                                //            -3 - 1   +  -3
		
		//   4 
		return res;
	}
	
	
	public static void main(String args[]) {
		
//		getRand();		
//		System.out.println(res);	
		
		System.out.println(    );
		
		for(int i=0;i<20;i++) {
			System.out.print( getRand(1, -3) + "," );
		}
	}

}
