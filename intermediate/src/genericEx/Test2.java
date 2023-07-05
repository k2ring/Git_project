package genericEx;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		
		List<String> arrList=new ArrayList<String>();
		arrList.add("금요일");
		arrList.add("토요일");
		
		for(int i=0;i<arrList.size();i++) {
			String yoil=arrList.get(i);
			System.out.println(yoil);
		}
		
	}

}
