package chapter09;

public class Exercise9_13 {

	static int stringCount(String src, String key) {
		return stringCount(src,key,0); 
	}
		
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		
		if(key==null || key.length()==0) {
			return 0;
		}
		
		while( (index = src.indexOf(key, pos))  != -1) {
			count++;
			pos = index + key.length();
		}
		return count;		
	}
	
	
	public static void main(String[] args) {
		String src = "aabbccaaAABBCCaa";
		System.out.println(src);
		System.out.println("a " + stringCount(src, "a") +"개");

	}

}
