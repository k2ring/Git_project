package chapter06;

public class Ex6_18 {
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
	
	//static int cv2 = iv; // A   인스턴스 변수를 static 변수에 대입 불가

	static void staticMethod1() {
		System.out.println(cv);
		//System.out.println(iv); // 인스턴스 변수를 static 메서드에서 접근 불가
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // C 라인
	}

	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1(); // D 라인  인스턴스 메소드를 static 메서드에서 접근 불가
	}

	void instanceMethod2() {
		staticMethod1(); // E 라인
		instanceMethod1();
	}

}
