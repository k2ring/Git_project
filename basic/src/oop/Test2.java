package oop;

public class Test2 {

	public static void main(String[] args) {
		
		
		
		
		Calculator hongCal=new Calculator();
//		
//		int res1=hongCal.add(3, 5);
//		System.out.println(res1);
//		
//		
//		int res2=hongCal.subtract(3, 5);
//		System.out.println(res2);
//		
//		
//		int res3=hongCal.multiply(3, 5);
//		System.out.println(res3);
//		
//		
//		double res4=hongCal.divide(3, 5);
//		System.out.println(res4);
		
		
		
		
		Person hong=new Person("hong",hongCal);
		
		
		System.out.println(hong.cal.add(4, 5));
		System.out.println(hong.name);
		

	}

}
