package nestedClass2;

public class Test {

	public static void main(String[] args) {
		
		A a=new A();
		
		// 인스턴스 멤버 클래스 객체 생성
		
		A.B	b=a.new B();
		
		
		b.field1=3;
		b.method1();
		
		System.out.println("===============");
		// 정적 멤버 클래스 객체 생성
		
		A.C c = new A.C();
		
		
		c.field1=5;
		c.method1();
		System.out.println("===============");
		
		
		a.method();

	}

}
