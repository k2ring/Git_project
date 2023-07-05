package exception;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		
		//parse  구문(문장의 구조), 문법의 해석해라
		
		//Wrapper클래스인  Integer를 이용해서
		//  숫자 형태의 문자열인 경우 Integer.parseInt("문자열") 를 사용해서 숫자로 바꿈..
		
//		System.out.println(Integer.parseInt("100") + 1);
		
		
//		int res=Integer.parseInt("100") + 2;
//		System.out.println(res);

		
		
		
//		int res2=Integer.parseInt("a100") + 2;
//		System.out.println(res2);
		
		int res;
		
//		System.out.println(res);
		try {
			res=Integer.parseInt("100") + 2;
			System.out.println(res);
			
		}catch(Exception e) {
			System.out.println("숫자형식만 넣으세요");
		}
		
		
			
		
		
		
	}

}
