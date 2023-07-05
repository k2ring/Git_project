package classEx;

//리플렉션 
//클래스의 생성자, 필드, 메소드 정보를 알아내는 것


import java.lang.reflect.Constructor;

public class ClassEx {

	public static void main(String[] args) {
//		Class 클래스
//		클래스와 인터페이스의 메타 데이터 관리
//		메타데이터: 클래스의 이름, 생성자 정보, 필드 정보, 메소드 정보

		Car car=new Car();
		Class class1=car.getClass();
//		System.out.println(class1);
//		System.out.println(class1.getName());
//		System.out.println(class1.getSimpleName());
//		System.out.println(class1.getPackageName());
		
//		System.out.println(class1.getConstructors());
		
//		Class.forName("classEx.Car");
		
		
		try {
			Class cls=Class.forName("classEx.Car");
//			System.out.println(cls.getName());
//			System.out.println(cls.getConstructors());
			
			
			
			Constructor[] cons=  cls.getDeclaredConstructors();
			
			for(Constructor con:cons) {
//				System.out.println(con.getName());
				Class[]  parameters=con.getParameterTypes();
				for(int i=0;i<parameters.length;i++) {
					System.out.println(parameters[i]);
				}
				System.out.println("=========");
			}
			
			
		}catch(Exception e) {
			
		}
		
		
	}

}
