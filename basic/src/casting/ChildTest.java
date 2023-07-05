package casting;

public class ChildTest {

	public static void main(String[] args) {
		Parent parent=new Child();  //자동 타입 변환
		parent.field1="data1";
		
		parent.method1();
		parent.method2();
		
		
		//parent.field2; 부모는 자식 필드와 메서드에 접근 불가
		//parent.method3();
		
		
		//강제로 타입 변환
		
		
		Child child = (Child) parent;
		child.field2="dkd";
		child.method3();

	}

}
