package chapter08_2;

class NumberException extends RuntimeException {
}

class InvalidNumberException extends NumberException {
}

class NotANumberException extends NumberException {
}

public class Ex8_4 {

	public static void main(String[] args) {
		// a
//		try {
//			method();	
//		}catch(Exception e) {
//			
//		}

		// b
//		try {
//			method();
//		} catch (NumberException e) {
//		} catch (Exception e) {
//		}

		// c
//				try {
//					method();
//				} catch (Exception e) {
//				} catch (NumberException e) {
//				}

		// d

//		try {
//			method();	
//		}catch(InvalidNumberException e) {
//			
//		}catch(NotANumberException e) {
//			
//		}

		// e
//		try {
//			method();
//		} catch (NumberException e) {
//		}

		// f

		try {
			method();
		} catch (RuntimeException e) {
		}

	}

	static void method() throws InvalidNumberException, NotANumberException {

	}
}
