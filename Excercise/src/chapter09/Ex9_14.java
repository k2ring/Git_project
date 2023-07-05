package chapter09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex9_14 {

	public static void main(String[] args) {
		String[] phoneNumArr = { "012-3456-7890", "099-2456-7980", "088-2346-9870", "013-3456-7890" };

		
//		Vector list = new Vector(); // Vector
		List list = new ArrayList(); // Vector
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			String input = s.nextLine().trim(); // trim()으로 입력내용에서 공백을 제거
			if(input.equals("")) {
				continue;
			}else if(input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}
			
			
			//패턴만들기
			
			
			String pattern=".*" + input + ".*";

			Pattern p=Pattern.compile(pattern);
			
			
			// 저장된 문자열 배열을 돌리면서 하나의 전화번호마다 패턴과 일치하면 list에 phoneNum 추가
			
			for(int i=0; i< phoneNumArr.length;i++) {
				String phoneNum = phoneNumArr[i];
				String tmp = phoneNum.replace("-","");
				Matcher m = p.matcher(tmp);
				if(m.find()) {
					list.add(phoneNum);
				}
			}
			
			
			
			//리스트에 추가
			
			
			if(list.size()>0) {
				System.out.println(list);
				list.clear();
			}else {
				System.out.println("일치하는 번호가 없다.");
			}
			
			
		}
		
		
	}

}
