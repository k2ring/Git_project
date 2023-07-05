package annotationEx;

import java.lang.reflect.Method;

public class PrintAnnotationEx {

	public static void main(String[] args) {
		
		Method[]  declareMethods =	Service.class.getDeclaredMethods();
		
		
		for(Method method:declareMethods) {
			
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
			
				PrintAnnotation printAnnotation=method.getAnnotation(PrintAnnotation.class);
				
				//메서드 이름 출력
				System.out.println(method.getName());
				
				//
				for(int i=0;i<printAnnotation.number();i++) {
					System.out.print(printAnnotation.value());
				}
				
				System.out.println();
			}
			
			
			
			
		}
	}

}
