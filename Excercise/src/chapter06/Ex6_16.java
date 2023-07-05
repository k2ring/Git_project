package chapter06;

public class Ex6_16 {
	
	
	// 지역 변수
	// 힙 영역에는 인스턴스(인스턴스 변수)가 생성되는 영역, 지역변수는 호출 스택(call stack)에 생성
	
	public static void main(String[] args) {
		int x=9;
		System.out.println(x);
	}
	
	void printx(){
//		System.out.println(x);
	}
}
