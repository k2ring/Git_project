package chapter06;

public class Exercise6_19 {

	public static void change(String str) {
		str += "456";
		System.out.println(System.identityHashCode(str));
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		change(str);
		System.out.println("After change:" + str);
	}
}
