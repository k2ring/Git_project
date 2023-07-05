package chapter07;

class Parent {
	int x = 100;

	Parent() {
		this(200);
		System.out.println("Parent 기본 생성자");
	}

	Parent(int x) {
	
		this.x = x;
		System.out.println("Parent(int x)  생성자");
	}

	int getX() {
		return x;
	}

}

class Child extends Parent {
	int x = 3000;
//	int y=100;

	Child() {
		
		this(1000);
		System.out.println("Child 기본 생성자");
	}

	Child(int x) {
		super();
		this.x = x;
		System.out.println("Child(int x)  생성자");
	}
	
	

}

// 호출되는 생성자의 순서
//Child()  -> Child(int x)  - >  Parent() -> Parent(int x)

public class Exercise7_7 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX());
	}

}
