package och10_ex02;

public class Throw02 {

	public static void main(String[] args) {

		int num = 100, result = 0;
		for(int i = 0; i < 10 ; i++ ) {
			// try-catch or throw 해줄것 
			// 이유 => 랜덤값으로 0이 나오면 0으로 나눌 수 없어서
			// ArithmeticException 발생
			int ran = (int)(Math.random()*10)+1;
			result = num/ran;
			System.out.println("나눗셈 결과 = " + result);
		}

	}

}
