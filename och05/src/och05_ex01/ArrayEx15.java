package och05_ex01;

public class ArrayEx15 {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("usage: java ArrayEx15 Num1 OP Num2"); // OP 오퍼레이팅 = 사칙연
			System.exit(0);
		}
		int num1 = Integer.parseInt(args[0]); //문자열을 숫자로 변환한다
		char op = args[1].charAt(0); //문자열을 문자(char)로 변환한다.
		int num2 = Integer.parseInt(args[2]);
		int result = 0;
		// HW07
		// + , - , X , / 수행 -->  switch
		// *는 .classpath를 가르키므로 x로 변경하여 사용하였음
		
		switch(op) {
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case 'X' :
			result = num1 * num2;
			break;
		default :
			System.out.println("수정");
		
		}
		System.out.println("결과 = " + result);

	}

}
