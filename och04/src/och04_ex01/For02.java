package och04_ex01;

import java.io.IOException;

public class For02 {

	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단 숫자는");
		int num = System.in.read() - '0';
		// HOME_WORK02
		// FOR 구구단 완성
		// 결과
		//		보고싶은 구구단 숫자는 7
		//		
		//		7 * 1 = 7
		//		7 * 2 = 14
		//		7 * 3 = 21
		//		7 * 4 = 28
		//		7 * 5 = 35
		//		7 * 6 = 42
		//		7 * 7 = 49
		//		7 * 8 = 56
		//		7 * 9 = 63
		
		for (int i = 1 ; i <=9 ; i++) {
			System.out.println( num + " * " + i + " = " + num*i);
		}

	}

}
