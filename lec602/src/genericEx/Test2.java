package genericEx;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("금요일");
		arrayList.add("토요일");
		
		for (int i = 0; i < arrayList.size(); i++) {
			String yoil = arrayList.get(i);
			System.out.println(yoil);
		}
	}

}
