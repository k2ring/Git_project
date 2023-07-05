import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		
		File file = new File("D:ex/cat2.jpg");
		
		System.out.println(file.getName());	
//		드라이브 : 파일경로 / 파일명 . 확장자 를 문자열로 인식후 확장자 반환
		
		System.out.println(file.getPath());	
//		전체 경로및 파일명까지 나옴
		
	}
}
