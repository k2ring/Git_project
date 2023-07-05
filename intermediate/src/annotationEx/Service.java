package annotationEx;

public class Service {

	@PrintAnnotation
	public void method1(){
		System.out.println("실행내용1");
	}
	
	@PrintAnnotation(value = "*")
	public void method2(){
		System.out.println("실행내용2");
	}
	
	@PrintAnnotation(number = 100)
	public void method3(){
		System.out.println("실행내용3");
	}
}
