package inputEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("D:/ex/test.txt"); //입력스트림이므로 자원이다. 자원은 공유되므로 다른 프로세스에서 사용하도록 사용했으면(open) 반납(close)
//		   System.out.print(fis);
		   
		   int i;
			while( (i = fis.read()) != -1) {   // read로 파일을 읽는 경우 파일의 끝에 도달하면 -1을 반환
				System.out.print((char)i);
			}
			
		   
		   
		} catch (Exception e) {
			System.out.println("파일 경로가 잘못됬거나, 파일명이 틀림");
//			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
