package och10_ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception02 {

	public static void main(String[] args) {
			BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));  // ? 구조  , stream은 물 흐르듯 읽는다, ?Scanner랑 뭐가 다른가
		
			while (true) {
				System.out.print("첫 번째 값을 입력하세요 = ");
				int num1;
				try {
					num1 = Integer.parseInt(bin.readLine());
					System.out.print("두 번째 값을 입력하세요 = ");
					int num2 = Integer.parseInt(bin.readLine());
					System.out.println(num1 + " / " + num2 + " = " + num1/num2);
					
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("NumberFormatException 이예요 = " + e.getMessage());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("IOException 이예요 = " + e.getMessage());
				}
				
//				catch (Exception e) {   // Exception 오류의 조상은 Exception 이다
//					System.out.println("system 점검중");
//				}
			}
			
	}
}
