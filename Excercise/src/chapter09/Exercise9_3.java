package chapter09;

public class Exercise9_3 {

	public static void main(String[] args) {
		String fullPath = "c:/jdk1.8/work/PathSeparateTest.java";
		String path = "";
		String fileName = "";

		
		int pos=fullPath.lastIndexOf("/");
		System.out.println(pos);
		
//		System.out.println(fullPath.substring(pos+1));
		
		path=fullPath.substring(0,pos);
		System.out.println(path);
		
		fileName = fullPath.substring(pos+1);
		System.out.println(fileName);
//		
//		System.out.println("fullPath:"+fullPath);
//		System.out.println("path:"+path);
//		System.out.println("fileName:"+fileName);
	}

}
