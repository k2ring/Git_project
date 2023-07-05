package chapter06;

public class MyClass2 {

	public static void main(String[] args) {

		add(3, 4);
		// 오버로딩 조건(이름이 같아야 하고, 개수 또는 타입이 달라야 함)

//		System.out.println();

	}

	static long add(int a, int b) {
		long result = a + b;
		return result;
	}

//	long add(int x, int y) {
//		return x + y;
//	}

	long add(long a, long b) { return a+b;}
	
	int add(byte a, byte b) { return a+b;}
	 int add(long a, int b) { return (int)(a+b);}
	
//	static float add(int aa, float bb){
//		float result = a + b;
//		return result;
//	}

//	static float add(float a, int b){
//		float result = a + b;
//		return result;
//	}

}
