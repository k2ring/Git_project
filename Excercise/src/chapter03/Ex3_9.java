package chapter03;

public class Ex3_9 {

	public static void main(String[] args) {
//		문자형 변수 가 영문자 대문자 또는 소문자 이거나 숫자일 때
		
//		char ch = '가';
		
//		'A' 'Z'
//		System.out.println(ch >='A'  &&  ch <='Z');  //영문자 대문자
//		// ||
//		System.out.println(ch >='a'  &&  ch <='z');  //영문자 대문자
//
//		System.out.println(( ch >='A'  &&  ch <='Z')  || (ch >='a'  &&  ch <='z'));
//		
//		//숫자
////		'0' '9'
//		System.out.println(ch >='0'  &&  ch <='9');
		
		
//		boolean b =( ch >='A'  &&  ch <='Z')  || (ch >='a'  &&  ch <='z' )  || (ch >='0'  &&  ch <='9');
		
//		System.out.println(b);
		
		
//		( ch >='A'  &&  ch <='Z')
		
		char ch = 'A';
		
		System.out.println(( ch >='A'  &&  ch <='Z') ?  (char)(ch + 32) : ch);
		
		
	}

}
