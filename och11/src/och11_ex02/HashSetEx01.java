package och11_ex02;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>(); // 순서를 유지하지 않고, 중복 허용 안한다
		hs.add("구렁2");
		hs.add("고양이");
		hs.add("야옹이");
		hs.add("구렁2");
		hs.add("진돗개");
		hs.add("멍멍이");
		
		for( String str : hs) {
			System.out.println(str);
		}
		
		System.out.println("=====Iterator=====");
//		Iterator<String> el = hs.iterator();
//		while(el.hasNext()) {
//			System.out.println(el.next());
//		}
		// 위 아래 똑같음 한번 더 해본거야
		Iterator<String> e = hs.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		

	}

}
