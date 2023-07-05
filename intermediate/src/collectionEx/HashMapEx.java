package collectionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set; //A collection that contains no duplicate elements. 

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> map = 	new HashMap<String, Integer>();
//		Map<String, Integer> map = 	new HashMap<String, Integer>();
		
//		System.out.println(map);
//		System.out.println(map.toString());		
		
		map.put("홍일동", 1000);
		map.put("홍이동", 75);
		map.put("홍삼동", 65);
		map.put("홍사동", 95);
		map.put("홍오동", 85);
		map.put("홍육동", 85);
		map.put("홍칠동", 85);
//		map.put("홍일동", 0);		
		
		//무조건 키값으로 value를 찾는 방식
				
		int score1=map.get("홍일동");   // 키값이 중복될 경우 마지막의 키값으로 나옴, 키를 중복되지 않게 사용
//		System.out.println(score1);
		
		//키값을 먼저 다 가져와보자
		//단, 키값은 중복되면 안됨(set)
		
		map.remove("홍이동");
		
		
		Set<String> keyset=map.keySet();   //set은 중복되지 않는 것이고 순서 없다.
		
//		System.out.println(keyset);

		for(String key : keyset) {
			System.out.print(key + " : ");
			int score=map.get(key);
			System.out.println(score);
		}
		
//		System.out.println(map.size());
//		

	}

}
