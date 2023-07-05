import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
//		Calendar cal = new Calendar(); 추상클래스이므로 인스턴스화 시킬 수 없다.
		
//		동적으로 인스턴스 생성
		
//		Calendar.getInstance();	// Calendar의 정적 메서드인 getInstance()를 이용하여 현재 운영체제에 설정되어 있는 시간대(TimeZone)를 기준으로
								// 의 하위 객체를 얻을 수 있다.
		
		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
		
		System.out.println(cal.getTime());
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;	// 월 0~11까지라 +1해줘야함
		int date = cal.get(Calendar.DATE);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
	}
}
