package stringEx;

public class Ex1 {

	public static void main(String[] args) {

//		
		char arr[]=new char [3];
		arr[0]='h';
		arr[1]='i';
		arr[2]='3';
		
		String str1=new String(arr);
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
		
		
		String str2=new String("nice");
		
		System.out.println(str2);
		
		String str="자바 크로그래밍";
		System.out.println(str);
		
		
		String str3=new String();
		
		
		
		
		//Hello Java를 String의 생성자를 이용해서
		//하나짜리 매개변수(바이트 배열) 
		//72 101 108 108 111 32 74 97 118 97
		
			byte arr2 [] = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};

			
			String str4=new String(arr2);
			System.out.println(str4);
			
			
//		for(int i=0;i<str.length();i++) {
//			System.out.println(str[i]);
//		}		

//		System.out.println(str.indexOf("바"));
//		
//		System.out.println(str.indexOf("하"));  // 찾고자 하는 값이 없는 경우 대부분의 언어에서 -1로 약속해 놓았다.
//		
//		if(str.indexOf("프") == -1) {
//			System.out.println("하라는 글자는 없다.");
//		}else {
//			System.out.println("찾음");
//		}

//		System.out.println(str.indexOf("자바"));		
//		
//		System.out.println(str.replace('크', '프'));

//		System.out.println(str.charAt(0));

//		String str = "12345";
//		int sum = 0;
//		
//		System.out.println('0'-'0');
//		System.out.println('1'-'1');
//		System.out.println('1'-'0');
//		System.out.println('2'-'0' + 3);
//		
//		int tot = 0;
//		for (int i = 0; i < str.length(); i++) {
//
//			tot = tot + str.charAt(i) - '0';
//
//		}
//		System.out.println(tot);

	}

}

