package och11_ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		
		// v는 객체
		HashMap<String, String> hm01 = new HashMap<String, String>();
	//    Key    Value
	//  1.Key   중복허용 X
	//  2.Value 중복허용 O
		
		hm01.put("김민재", "010-1023-5678");
		hm01.put("손흥민", "010-2225-5678");
		hm01.put("전지현", "010-8614-5678");
		
	//              김민재 손흥민 전지현      
		Set<String> st = hm01.keySet();  // 디자인 패턴, 자주 쓰인다  ,, keySet()  => key 값만 가져온다
		for(String str : st) {
			System.out.println(str + "의 전화[Set] => " + hm01.get(str));
		}
		
		Iterator<String> it = hm01.keySet().iterator();  // keySet() 안하면 iterator() 없음
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + "의 전화 => " + hm01.get(key));
		}
	}

}
