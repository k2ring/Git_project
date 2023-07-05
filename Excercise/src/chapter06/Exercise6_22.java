package chapter06;

public class Exercise6_22 {
	
	
	static boolean isNumber(String str){
		
		if(str ==null || str.equals("")) {
			return false;
		}
		
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if( ch <'0' || ch >= '9'  ) {
				return false;
			}
			
		}
		
		return true;
	}
	

	public static void main(String[] args) {
		
		String str ="1454543546534";
		System.out.println(str+" ? "+isNumber(str));
		str = "1234o";
		System.out.println(str+" ? "+isNumber(str));
	}

}
