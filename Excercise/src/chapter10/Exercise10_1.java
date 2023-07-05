package chapter10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
					
//		System.out.println(Calendar.DAY_OF_WEEK);
		
		//2010년 1월 1일   0이 1월
//		cal.set(2010, 0, 1);
		cal.set(2023, 0, 1);
		// 1 일요일, 2 월 
		
//		int weekday_test=cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(weekday_test);
		
		for(int i=0;i<12;i++) {
			int weekday=cal.get(Calendar.DAY_OF_WEEK);			
			
			
			int secondSunday = (weekday==1) ? 8 : 16 - weekday;
			
			cal.set(Calendar.DAY_OF_MONTH, secondSunday);
			Date d=cal.getTime();
			
			System.out.println(new SimpleDateFormat("yyyy-MM-dd F번째 E요일입니다.").format(d));
			
			// 날짜를 다음달 일로 변경한다
			cal.add(Calendar.MONTH, 1);
			cal.set(Calendar.DAY_OF_MONTH,1);
		}
		
		
		
		
	}

}
