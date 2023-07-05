package chapter04;

public class Ex4_1 {

	public static void main(String[] args) {
		
//		int x=11;
//		System.out.println(x>10 && x<20);
		
//		char ch=' ';
//		System.out.print("hi\nnice");
//		System.out.print("hi\tnice");
//		System.out.println( !(ch == ' ' || ch == '\t'));
//		System.out.println( ch == 'x' || ch == 'X');
		
//		System.out.println( ch >= '0' && ch <= '9');
		
//		System.out.println( (ch >= 'A'  && ch <= 'Z')  || (ch >= 'a'  && ch <= 'z') );
		
//		int year=0;		
//		System.out.println(  (year % 400 == 0)  ||  (year % 4 ==0)  &&    (year % 100 != 0)  );
		
		
//		boolean powerOn=false;		
//		
//		System.out.println( powerOn == false);
		
		
		String str="yes";
		
		String str2 = new String("yes");
		
		// 주소값이 같은지 여부는 ==, 실제 문자열값이 같을 경우에는 equals 
		System.out.println(str.equals("yes"));
		
		System.out.println(str == "yes");
		
		System.out.println(str2 == "yes");
		
		
	}

}
