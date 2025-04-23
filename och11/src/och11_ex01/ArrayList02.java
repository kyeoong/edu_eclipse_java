package och11_ex01;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("수박");
		list.add("사과");
		list.add("바나나");
		list.add("수박");
		list.add("대추");
		list.add("바나나");
		System.out.println("개수 = " + list.size());
		devPrint(list); // ReUse 재활용을 위해 static
//       0   1   2       3   4   5      배열은 아니다
//      수박	사과	바나나	수박	대추	바나나
		list.add(1, "딸기");  // ( index, 원소 ) \인덱스 1에 사과 자리에 딸기를 넣고 뒤로 밀린다
		devPrint(list);
//      0   1   2        3    4   5    6     인덱스 1에 사과 자리에 딸기를 넣고 뒤로 밀린다
//      수박	딸기	사과     바나나	 수박	 대추	  바나나
		list.set(4, "복숭아");  // set은 해당 원소만 교체, add는 밀린다
		devPrint(list);
		list.remove(0);
		devPrint(list);
		System.out.println("3번 인덱스 ==> " + list.get(3));
		System.out.println("바나나 문의 = " + list.contains("바나나"));
		System.out.println("바나나 문의 = " + list.indexOf("바나나")); // 바나나가 2개 이상이면 가장 처음 것을 가져온다
		System.out.println("바나나 문의 = " + list.lastIndexOf("바나나")); // 가운데에 있으면 어쩌냐? 방법 없음 다른걸로 해야지 뭐
		for(int i = 0; i <list.size(); i++) { // 리스트는 length 사용 안되네
			if(list.get(i).equals("바나나")) {
				list.set(i, "천혜향");
			}
		}
		devPrint(list);
	}
	
	private static void devPrint(ArrayList<String> paramlist) { // list 이름 똑같이 맞출 필요 없다
		for(String str : paramlist) {  // private static 이니깐 ArrayList02 클래스를 참조하는 모든 인스턴스(여기가 대상이 헷갈려)들은 str을 공유하게 된다? 아니면 devPrint()메소드를 공유한다?
			System.out.print(str + "\t");
		}
		System.out.println("\n-------------------------------------------------");
	}

}
