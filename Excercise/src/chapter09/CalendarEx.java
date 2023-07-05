package chapter09;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
//		Calendar cal=new Calendar(); 추상클래스이므로 인스턴스화 시킬 수 없다.
		
		// 동적으로 인스턴스 생성
//		Calendar.getInstance();  // Calendar의 정적 메소드인 getInstance()를 이용하여 현재 운영체제에 설정되어 있는 시간대(TimeZone)를 기준으로
		                         // Calendar의 하위 객체를 얻을 수 있다.
		
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		
		int year=cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month= cal.get(Calendar.MONTH) +1;
		System.out.println(month);
		
		int date=cal.get(Calendar.DATE);
		System.out.println(date);
		
		
		
		int date2=cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(date2);
		
		
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		String week2=null;
		
		switch( week) {
			case Calendar.MONDAY:
				week2="월";
				break;
			case Calendar.TUESDAY:
				week2="화";
				break;
			case Calendar.WEDNESDAY:
				week2="수";
				break;
			case Calendar.THURSDAY:
				week2="목";
				break;
			case Calendar.FRIDAY:
				week2="금";
				break;
			case Calendar.SATURDAY:
				week2="토";
				break;
		}
		System.out.println(week2);
		
		
		
		
		
		
		
		
	}

}
