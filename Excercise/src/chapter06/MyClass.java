package chapter06;

public class MyClass {

	
	//this는 인스턴스 메서드에서만 사용가능
	
	
	int value;
	
	
	public MyClass(int value) {
		this.value=value; //지역변수와 인스턴스변수를 구별할 때 사용한다
	}
	
	//인스턴스 메서드에서는 this를 사용할 수 있다. 해당 객체의 인스턴스 변수에 접근하는데 사용
	public void myClassMethod1(){  
		this.value=10;
	}
	
	//클래스(static) 메서드 : static 메서드에서 인스턴스 변수에 접근시 컴파일 오류
	public static void myClassMethod2(){  
//		this.value=10;
	}
	
}
