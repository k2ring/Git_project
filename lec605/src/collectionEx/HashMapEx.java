package collectionEx;		// 자료구조_참조형

import java.util.HashMap;
import java.util.Map;
import java.util.Set;	// *중복 요소를 포함하지 않는 컬렉션

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
//		System.out.println(map);
//		System.out.println(map.toString());
		
//			입력	Key		Value
		map.put("홍일동", 1000);
		map.put("홍이동", 75);
		map.put("홍삼동", 65);
		map.put("홍사동", 95);
		map.put("홍오동", 85);
		map.put("홍육동", 85);
		map.put("홍칠동", 85);
		map.put("홍일동", 0);			// 주키 중복시 마지막값으로 오버라잇
		// 무조건 키값으로 value를 찾는 방식
		
//		int score1 = map.get("홍일동");
//		int score2 = map.get("홍이동");
//		int score3 = map.get("홍삼동");
//		int score4 = map.get("홍사동");
//		int score5 = map.get("홍오동");
		
//		System.out.println(score1);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
		// 키값을 먼저 다 가져와보자
		// 단, 키값은 중복되면 안됨(set)
		
		map.remove("홍이동");
		
		Set<String> keyset = map.keySet();
		
//		System.out.println(keyset);		// set는 중복되지 않는 것이고 순서가 없다.
		
										// []로 나오는데 배열로 봐야할것이냐?
		for( String key : keyset) {		// -> 배열은 아니지만 배열로 받을 수는 있다.
			System.out.print(key + " : ");
			int score = map.get(key);
			System.out.println(score);
		}
		
//		System.out.println(map.size());
	}
}
