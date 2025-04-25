package och04_ex02;

public class SwitchStringEx {

	public static void main(String[] args) {
		// Hw03
		// 스위치 문
		 // 부장 -> 700만원
		 // 과장 -> 500만원
		 // 그외 -> 300만원
		String position = args[0];

		switch(position) {
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		default :
			System.out.println("300만원");
		}
	}

}
