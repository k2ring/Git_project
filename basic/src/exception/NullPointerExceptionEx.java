package exception;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		
//		Object obj=null;
//		
//		obj = "hi";
//		System.out.println(obj.toString());  // Returns a string representation of the object.
		
		//
		
		String str=null;
		
		   // 예외 발생
		
		//예외 발생한 줄을 잘 기억하시라!!!
				
		// 예외 처리 코드 패턴		
		
		// 예외가 발생할 수 있으니 일단 한 번 시도해봐라,,,!!!! (try)
		
		//예외가 날 경우에는 잡아라(catch)
		
		try {
			//예외가 발생할 가능성이 있는 코드
			System.out.println(str.toString());
		}catch(Exception e) {
			//예외가 났을 경우 대비하는 코드
//			System.out.println("예외가 났네요");
//			System.out.println("문자열의 값이 저장되지 않았네요");
			
			e.printStackTrace();
		}finally {
			//예외 발생여부와 상관없이 반드시 실행되는 코드는 여기에 작성하면 됨
			System.out.println("ㅋㅋㅋ");
		}
		
		
		
		
		

	}

}
