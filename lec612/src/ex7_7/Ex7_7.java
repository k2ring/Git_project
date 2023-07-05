package ex7_7;

class Parent {
	int x = 100;

	Parent() {
		this(200);
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000);
		System.out.println("여기는 Child 기본 생성자");
		System.out.println(x);
	}

	Child(int x) {
		this.x = x;
	}

}

public class Ex7_7 {

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x.Child = " + c.getX());
		System.out.println("x.Parent = " + c.x);
	}

}
