package fileEx;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		
		File file=new File("D:/ex/cat2.jpg");
		
		System.out.println(file.getName());  //   드라이브경로:/폴더명/파일명.확장자을 문자열로 인식 후에 파일명.확장자 반환
		
		System.out.println(file.getPath());  //   전체 경로와 파일명까지 나옴
		
		

	}

}
