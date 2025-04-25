package och04_ex01;

import java.util.Scanner;

public class Do03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // System.in.read()는 아스키코드로 읽고 스캐너는 숫자 그대로 입력받는다
		int myAnswer = 0;
		int cnt = 0;
		int systemAnswer = (int) (Math.random()*100) + 1;
		
		do {
			System.out.println("system 숫자가 1~100 중 어떤 숫자일까요효");
			myAnswer = sc.nextInt();
			System.out.println("myAnswer = " + myAnswer);
			
			if ( systemAnswer == myAnswer ) {
				System.out.println(cnt + "번에 맞췄습니다 축하합니다");
				break;
			} else if(systemAnswer > myAnswer ) {
				System.out.println("더 큰 수를 입력하세요를레이");
			} else System.out.println("더 작은 수를 입력하세요");
			
			cnt++;

		} while(true);
		
		
		// double systemAnswer = (Math.random());
		System.out.println(cnt + " The End");
		
		
	}

}
