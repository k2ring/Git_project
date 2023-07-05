package baseEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		
		Date date=new Date();
		
//		System.out.println(date);
//		System.out.println(date.toString());
//		
//		String str=date.toString();
//		
//		System.out.println(str);
		
		//간단한 날짜 포맷으로 사용 //yyyy year , MM month  dd day   hh  hour  mm minuites  ss seconds 
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh분 mm분 ss초");
//		System.out.println(sdf);
//		
//		System.out.println(sdf.toString());
		
		System.out.println(sdf.format(date));

	}

}
