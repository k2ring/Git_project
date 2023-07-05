package chapter06;

public class MyClass3 {

	
	int num;
	
	
	static int num2;
	
	//클래스변수는 클래스가 처음 메모리에 로딩될 때 자동 초기화 됨, 인스턴스변수보다 먼저 초기화  
	
	//초기화 블록(식이 복잡한 경우에 초기화할 경우에 사용)이 생성자보다 먼저 수행 됨
	static {		
		num2= 5 +3 -1;
	}
	
	public MyClass3() {
		num2=8;
	}
//	
	public static void main(String[] args) {
//		System.out.println(MyClass3.num2);
		
		MyClass3 mc=new MyClass3();
		System.out.println(mc.num);
	}
}
