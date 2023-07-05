package annotationEx;

public class Service {

	@PrintAnnotation
	public void method1() {
		System.out.println("실행1");
	}
	
	@PrintAnnotation(value = "*")
	public void method2() {
		System.out.println("실행2");
	}
	
	@PrintAnnotation(number = 100)
	public void method3() {
		System.out.println("실행3");
	}
}
