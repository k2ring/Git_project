package inputEx;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		int i;
		try {
			while( (i = System.in.read()) != '\n') {	// 무한입력 방지
				
							// '\n'
//				System.out.println(i = System.in.read());				
				
//				(i = System.in.read()) == '\n';
				
//				System.out.print((i = System.in.read()));				
				
				System.out.print((char)i);
//				System.out.print(i);
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
