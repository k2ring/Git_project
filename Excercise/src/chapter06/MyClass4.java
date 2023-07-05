package chapter06;

public class MyClass4 {
	static {
        System.out.println("초기화 블록"); // 초기화 블록
    }
    
    public MyClass4() {
        System.out.println("생성자"); // 생성자
    }

    public static void main(String[] args) {
    	MyClass4 obj = new MyClass4(); // 객체 생성
    }
}
