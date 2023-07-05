package chapter06;

public class MyClass5 {

	private int x = 1; // 명시적 초기화

	public MyClass5() {
		System.out.println("생성자 호출");
		x = 2;
	}
	
	public void printX() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		MyClass5 mc5=new MyClass5();
		mc5.printX();
	}

}
