package chapter10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_4 {

	public static void main(String[] args) {
		
		String pattern = "yyyy/MM/dd";
		String pattern2 = " E"; // 'E'는 일 ~ 토 중의 하나가 된다.
		
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
				
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		do {
			System.out.println(" " + pattern + "의 형태로 입력해주세요.(입력예:2007/05/11)");
			
			try{
				System.out.print(">>");
				inDate = df.parse(s.nextLine()); // Date . 입력받은 날짜를 로 변환한다
				break; // parse()에서 예외가 발생시 멈춤
			}catch(Exception e) {
				
			}
			
			
		}while(true);
		
		System.out.println(df2.format(inDate));
	}

}
