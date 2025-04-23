package och11_ex03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExHw01 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("신용균", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수 = " + map.size());
		
		
	//  객체 찾기  -> 전체 원소,  신용균
		System.out.println("전체 원소 = " + map); // 전체 원소 = {신용균=80, 홍길동=95, 신용권=85}
		System.out.println("신용균 = " + map.get("신용균"));
		
	//  객체를 하나씩 처리 keySet선언후 이를 이용 iterator,  처리
		System.out.println("======= 객체를 하나씩 처리 KetSet, Iterator ==========");
		Iterator<String> e = map.keySet().iterator();
		while(e.hasNext()) {
			String str = e.next();
			System.out.println(str  + " = " + map.get(str));  // str 말고 e.next하면 왜 오류가 날까 --> 두 번 호출하게 된거다
		}
	}
//	--- 객체를 하나씩 처리 keySet ->iterator   --- 
//	신용균 : 80
//	홍길동 : 95
//	신용권 : 85
}
