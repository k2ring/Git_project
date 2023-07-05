package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEx {
	
	//일부러 예외를 발생시킬수도 있음
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// 예외를 처리하는 두가지 방법 중 1
		try {
			new FileInputStream("aaa.txt");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		
		
		// 예외를 처리하는 두가지 방법 중 2, 떠넘기는 방법
		
		new FileInputStream("aaa.txt");
				
		
	}

}
