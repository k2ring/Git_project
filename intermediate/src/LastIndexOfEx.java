
public class LastIndexOfEx {

	public static void main(String[] args) {
		
		String str="C:\\file_repo\\one\\two";
		
		System.out.println(str.lastIndexOf("\\"));
		
		
		String str2="C:/file_repo/one/two";
		System.out.println(str2.lastIndexOf('/'));
//		
//		
//		
		String str3="C:/file_repo/one/two/cat.jpg";
//		
		int idx=str3.lastIndexOf('/');
		System.out.println(str3.substring(idx+1));
		
		
		//파일만 가져오려면 중간에 가져온 부분에 혹시라도 // 나 \가 없어야 함
		//그래서 -1(위치에 대한 인덱스 값이 없다.)이 나올 때까지 돌려줌
	}

}
