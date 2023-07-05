package outputEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try {
			fos = new FileOutputStream("D:/ex/hello4.txt");
			
			fos.write(65);

			fis = new FileInputStream("D:/ex/hello4.txt");
			int ch = fis.read();
			System.out.println((char) ch);

		} catch (Exception e) {
			System.out.println("파일 쓰기 중 예외 발생");
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				fis.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
