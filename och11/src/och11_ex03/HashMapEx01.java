package och11_ex03;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		// v는 객체
		HashMap<String, String> hm01 = new HashMap<String, String>();
//      Key    Value
	//  1.Key   중복허용 X
	//  2.Value 중복허용 O
		hm01.put("김민재", "010-1023-5678");
		hm01.put("손흥민", "010-2225-5678");
		hm01.put("전지현", "010-8614-5678");
		hm01.put("전지현", "010-1234-5678");
		hm01.put("전지현2", "010-1234-5678");
		
		System.out.println("김민재 TEL = " + hm01.get("김민재")); // key 값을 넣는다   -> value 값을 리턴한다
		System.out.println("손흥민 TEL = " + hm01.get("손흥민"));
		System.out.println("전지현 TEL = " + hm01.get("전지현")); // 중복된 키 값은 최종 키 값의 value를 준다
		System.out.println("전지현 TEL = " + hm01.get("전지현2"));
		
	}

}
