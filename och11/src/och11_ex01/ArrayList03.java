package och11_ex01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList03 { // 현장나가면 ArrayList 많이 쓴다

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("바나나");
	//	
		System.out.println("element 개수 = " + list.size());
		System.out.println("list -> " + list);
	//	                         [ 사과, 바나나, 귤, 오렌지, 바나나 ]
		System.out.println(">> literator 객체로 요소 얻기 <<");
		Iterator<String> elements = list.iterator();  // ? 여기 부분 모르겠음
	//  원소가 있다면 
		while (elements.hasNext()) { 
	//                           요소를 얻어내어 출력
			System.out.print(elements.next()+"\t");  // ? hasNext(), next() 알아보기
		}
		System.out.println("\n");
	
		System.out.println("==================================");
		
		
		System.out.println(">> get 메소드로 요소 얻기 <<");  // ? 위에 이터레이터랑 뭐가 다르냐?
		for(int i = 0; i<list.size(); i++)
			System.out.print(list.get(i) + "\t");
		System.out.println();

	}

}
