package och04_ex03;

import java.util.Scanner;

public class Ex0302 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0; //잔액
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");
			int menuNum = scanner.nextInt();
			int plus = 0;
			// HW06 switch 문으로 진행
						// menuNum->1
						//   1) balance = balance + 예금액
						// menuNum->2
						//   2) balance = balance - 출금액
						// menuNum->3
						//   잔고 조회 콘솔에 보여줌
			switch(menuNum) {
			case 1 :
				System.out.print("예금액> ");
				plus = scanner.nextInt();
				balance += plus;
				break;
			case 2 :
				System.out.print("출금액> ");
				plus = scanner.nextInt();
				balance -= plus;
				break;
			case 3 :
				System.out.print("잔고 금액> " + balance);
				break;
			case 4 :
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
