package chapter07;


class Parent2{
	void hi(){
		System.out.println("hi 호출");
	}
}

class Child2 extends Parent2{
	@Override
	void hi() {
		
		System.out.println("hi 재정의");
	}
	}


public class Ex7_9 {
	
	public static void main(String[] args) {
		
		hi();
	}
	
	static void hi() {
		final int a=3;
		System.out.println(a);
	}

}
