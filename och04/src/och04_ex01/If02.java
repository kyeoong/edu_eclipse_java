package och04_ex01;

public class If02 {
	public static void main(String[] args) {
							  // args[0] 첫번째 파라매타 param
		int a = Integer.parseInt(args[0]);
							  // args[1] 두번째 파라매타 param
		int b = Integer.parseInt(args[1]);
		
		String str = args[2]; // 3번째 , parseInt 안한 이유는 => 문자로 받기 위하여
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("str = " + str);
		
		if ( a > 0) {
			System.out.println(a + "는 양수");
		}else {
			System.out.println(a + "는 음수");
		}
		System.out.println("프로그램 종료");

	}
		
	}
// 인덱스가 없는데 왜 인덱스를 받는가 라는 오류