package och10_ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));  // ? 구조  , stream은 물 흐르듯 읽는다, ?Scanner랑 뭐가 다른가
		
		while (true) {
			System.out.print("첫 번째 값을 입력하세요 = ");
			int num1 = Integer.parseInt(bin.readLine());  // parse은 문자열을 바꿔주겠다   ,  a carriage return ('\r') -> 엔터값이 들어가면 문자의 끝으로 알겠다
			System.out.print("두 번째 값을 입력하세요 = ");
			int num2 = Integer.parseInt(bin.readLine());
			System.out.println(num1 + " / " + num2 + " = " + num1/num2);
			
		}

	}

}
