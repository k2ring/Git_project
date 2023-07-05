package chapter03;

public class Ex3_4 {

	public static void main(String[] args) {
		
//		int num = 111;
//		System.out.println(num / 100 * 100);
		
//		int num = 777;
//		System.out.println(num / 10 * 10 +1 );
		
//		int num = 81;
//		
//		System.out.println(10 -num % 10 );
		
		
//		int fahrenheit = 100;
//		
//		System.out.println(5f / 9 );   //0.5555556
//		
//		System.out.println(5f / 9    * 100-32);
//		
//		System.out.println(5f / 9    * (100-32));
//		
//		double tmp = 5f / 9    * (100-32);
//		
//		System.out.println(tmp);
//		
//		System.out.println(tmp*100 +0.5);
//		
//		System.out.println((int)(tmp*100 +0.5));
//		
//		System.out.println((int)(tmp*100 +0.5) / 100f);
		
		
		
//		System.out.println(5/9 * (fahrenheit - 32));
		
		
		
       
		int fahrenheit = 100;
		
		float tmp=5f/9  * (fahrenheit - 32);
		
		
		
		 System.out.println(Math.round(  tmp * 100 ) * 0.01);
		 
		 System.out.println(Math.round(  tmp * 100 ) /100f);
		 
		 
		 System.out.println(  (int)(tmp * 100 + 0.5)  / 100f);
		
//		 System.out.println(Math.round(5f/9  * (fahrenheit - 32)));
		 
//		 float celcius = 5/9 ×(fahrenheit - 32);
		
//		System.out.println("Fahrenheit:"+fahrenheit);
//		System.out.println("Celcius:"+celcius);
		
	}

}
