package och04_ex01;

import java.io.IOException;

public class While02 {

	public static void main(String[] args) throws IOException { // 코딩테스트 나온다, 인성 면접 마음에 들면 코딩테스트 해서 가르친다
		System.out.println("보고싶은 구구단은?");
		//  ASCII    Code
		//            5(53)        - 0(48)
		int num = System.in.read()-'0';  // System.in.read()는 아스키 코드 값으로 받는다
		System.out.println("num = " + num);
		
		int i = 1;
		
		if ( num >= 2 && num <= 20 ) {
			while ( i <= 9 ) {
				System.out.println(num + " * " + i + " = " + num * i);
				i++;
			}
		} else {
			System.out.println("구구단에 없는 숫자입니다");
		}
		

	}

}
