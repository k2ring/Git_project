package nestedClass2;

class A {

	A() {
		System.out.println("A 객체가 생성됨");
	}

	// 인스턴스 멤버 클래스
	class B {
		// 필
		int field1;
		static int field2;

		// 생
		B() {
			System.out.println("B 객체 생성");
		}

		// 메

		void method1() {
			System.out.println("classB-method1");
		}

		static void method1_1() {

		}

	}

	// 정적 멤버 클래스
	static class C {
		// 필
		int field1;
		static int field2;

		// 생
		C() {
			System.out.println("C 객체 생성");
		}

		// 메

		void method1() {
			System.out.println("C 클래스 - method1");
		}

		static void method1_1() {

		}
	}



	
	void method(){
		//로컬(지역, 메소드 안의 영역) 클래스			
		
		class D{
			//필
			int field1;
			//생
			D() {
			
			}
			//메
			void method1(){
				System.out.println("D클래스 - method1");
			}
			
		}
		
		
		
		D d=new D();
		d.field1=15;
		d.method1();
		
	}
	


}
