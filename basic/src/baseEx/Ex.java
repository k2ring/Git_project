package baseEx;

public class Ex {

	public static void main(String[] args) {
	
	

		Object obj1=new Object();		
		System.out.println(System.identityHashCode(obj1));
		
		Object obj2=new Object();		
		System.out.println(System.identityHashCode(obj2));
		
		
		System.out.println(obj1 == obj2);
		
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}

}
