package genericEx;
		
import java.util.ArrayList;
		
public class Test {
		
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayList arrList = new ArrayList();
//		ArrayList<String> arrList = new ArrayList<String>();
		
//		System.out.println(arrList);
//		System.out.println(System.identityHashCode(arrList));
//		System.out.println(arrList.add("금요일"));
//		System.out.println(arrList.add(8));
		
		arrList.add("금요일");
		arrList.add(7);
//		arrList.add("금요일");
//		arrList.add(7);
//		arrList.add("금요일");
//		arrList.add(7);
		
		
		System.out.println(arrList.get(0));
		String yoil = (String) arrList.get(0);
		int num = (int) arrList.get(1);
//		System.out.println();
////		System.out.println(arrList.get(1));

//		for (int i = 0; i < arrList.size(); i++) {
//			System.out.println(arrList.get(i));
//			
//		}
	}
}