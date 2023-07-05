package chapter02;

public class Variable {

	
	//bsil fd cb
	//1248 48 21
	
	
	long sid=7701011111222L;
	
	
	//literal (값)
	
	
	public static void main(String[] args) {
		//System.out.println("1" + "2"); 
//		System.out.println(true + "");   // 문자열과 문자열이 아니 타입이 + (연결)되는 경우 다 문자열로 변경
										// char타입은 정수형타입과 호환 되므로 연산시 ASCII에 맞는 숫자로 변환되서 연산
//		System.out.println('A' + 'B'); 
//		System.out.println('1' + 2);
//		System.out.println('1' + '2');
//		System.out.println('J' + "ava");
//		System.out.println(true + null); // 에러
		
		//참조형 변수: 변수안에 주소값이 들어가 있음(주소값의 크기 4byte)
		
		
		//형변환(자동, 강제)
		
		
		
		
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		
		b=(byte) i;
		
		ch=(char)b; // 범위가 달라서 형변환 필요 , char는 양수 범위
		
		short s = (short) ch;  // 범위가 달라서 형변환 필요 , char는 양수 범위
		
		float f=l;   // float가 커서 생략 가능   b<s<i<l<f<d
		
		i=ch; // chr는 2byte, int 4byte이므로 생략 가능 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
