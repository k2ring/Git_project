package chapter05;

import java.util.Calendar;

public class WeekEx {

	public static void main(String[] args) {
		
		Week today=null;
		
		Calendar cal =Calendar.getInstance();
		
		//일 1, 월 2, 화 3 수 4 목 5 금6 토 7
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		int week=cal.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1:
			today=Week.SUNDAY;
			break;
		case 2:
			today=Week.MONDAY;
			break;
		case 3:
			today=Week.TUESDAY;
			break;
		case 4:
			today=Week.WEDNESDAY;
			break;
		case 5:
			today=Week.THURSDAY;
			break;
		case 6:
			today=Week.FRIDAY;
			break;
		case 7:
			today=Week.SATURDAY;
			break;
		}		
		
		System.out.println("오늘은 " + today);

	}

}
