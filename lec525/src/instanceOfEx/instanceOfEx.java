//package instanceOfEx;
//
//public class instanceOfEx {
//
//	// 어떤 객체가 어떤 클래스의 인스턴스인지 확인하려면 instanceOf 연산자를 사용할 수 있다.
//	// 좌측에는 객체가 오고 우측에는 타입, 우측의 타입으로 객체가 생성되었다면 true, 그렇지 않으면 false
//
//	static void method1(Parent parent) {
//
//		if (parent instanceof Child) {
//			Child child = (Child) parent;
//			System.out.println("method1 - Child 변환 성공");
//		} else {
//			System.out.println("method1 - Child 변환 실패");
//		}
//	}
//
//	
//	static void method2(Parent parent) {
//		Child child = (Child) parent;
//		System.out.println("method2에서 Child 변환 성공");
//	}
//
//	
//	public static void main(String[] args) {
//		Parent parentA = new Child();
//		method1(parentA); // Child 객체를 매개값으로 전달
//		method2(parentA);
//
//		Parent parentB = new Parent();
////		method1(parentB);
//		method1(parentB);	// Parent 객체를 매개값으로 전달하여 예외상황 발생,
//							// 그래서 instanceof 연산자로 자식이 아닌 부모에서 나온것을 확인 할 필요 있음
//
//	}
//
//}
