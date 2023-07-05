package inputEx;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {

		int i;
		try {
			while ( (i = System.in.read()) != '\n') { // 무한하게 입력되지 않도록 해야 한다.

				// '\n'
//				System.out.print(i = System.in.read());
				
//				(i = System.in.read()) == '\n'
				
//				System.out.print(i = System.in.read());
				
				System.out.print((char)i);
				
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
