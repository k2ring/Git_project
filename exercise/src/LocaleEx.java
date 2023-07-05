import java.util.TimeZone;

public class LocaleEx {

	public static void main(String[] args) {

		String arr[] = TimeZone.getAvailableIDs();
		
		System.out.println(TimeZone.getTimeZone("Asia/Seoul"));
		
		
//		for (String i : arr) {
//			System.out.println(i);
//		}
	}

}
