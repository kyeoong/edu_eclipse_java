package och11_ex01;

import java.util.Vector;

public class VectorEx02 {
	
	public static void vecPrint(Vector<String> vc) {
		for (String str : vc) {
			System.out.print(str + "\t");
		}
		System.out.println("\n===========================================");
	}

	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();
		vc.add("수박");
		vc.add("고추");
		vc.add("수박");
		vc.add("대추");
		vc.add("오이");
		System.out.println("개수 = " + vc.size());
		vecPrint(vc);
	// 1번 자리에 키위 끼워 넣기 -> 현장 Work
		vc.add(1, "키위");
		vecPrint(vc);
	// 4번 복숭아 바꾸기
		vc.set(4, "복숭아");
		vecPrint(vc);
	// 0번 삭제하기
		vc.remove(0); // poll을 생각해버렸다
		vecPrint(vc);
		
		vc.add("수박");
		System.out.println("2번 인덱스 => " + vc.get(2));
		System.out.println("수박 문의 ( 포함 여부 ) => " + vc.contains("수박"));
		System.out.println("수박 문의 (Index) => " + vc.indexOf("수박"));
		System.out.println("수박 문의 = " + vc.lastIndexOf("수박"));
		vecPrint(vc);
		
	//  전체에서 수박 -> 바나나로 교체
		for(int i =0; i < vc.size(); i++) {
			if(vc.get(i).equals("수박")) {
				vc.set(i, "바나나");
			}		
		}
		vecPrint(vc);
		
	}

}
