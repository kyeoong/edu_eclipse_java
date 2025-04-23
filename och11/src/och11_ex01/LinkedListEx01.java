package och11_ex01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx01 {

	public static void main(String[] args) {
		LinkedList<String> kk = new LinkedList<String>();
		String[] animal = {"산토끼", "고양이", "진돗개", "치와와", "토끼"	, "고양이"};
		
		for( int i = 0; i < animal.length ; i++) {
			kk.add(animal[i]);
		}
		System.out.println("kk = " + kk);  // 중복 허용, 순서 그대로  ,, 그때 animal로 하면 해시코드 나오지 않았나?
		
		// Iterator 조회하기
		
	//	Iterator<String> str = animal.iterator();
		int i = 0;
		Iterator<String> str = kk.iterator();
		while(str.hasNext()) {
			System.out.println(i + " = " + str.next());
			i++;
		}
		
		System.out.println("-------poll()---------");
		System.out.println("kk 2 = " + kk);
		i = 0;
		while(!kk.isEmpty()) {
			System.out.println(i + " => " + kk.poll());
			i++;
		}
		System.out.println("kk 3 => " + kk);
		
		
		
		
		
		
		
	}
}
