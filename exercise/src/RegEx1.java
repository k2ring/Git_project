import java.util.regex.Pattern;

public class RegEx1 {

	public static void main(String[] args) {
		String regEx="(02|010)-\\d{3}-\\d{4}";
		String data="010-123-4567";
		
		boolean result = Pattern.matches(regEx, data);
		System.out.println(result);
		
		if (result) {
			System.out.println("정규식");
		} else {
			System.out.println("비일치");
		}
				
	}
}
