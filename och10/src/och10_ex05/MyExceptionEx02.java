package och10_ex05;
//1.최소급여
//java MyExceptionEx02 num1
//사장님 200만원 보다 적어요 !! 이 뭡니다
//2.최대급여
//java MyExceptionEx02 num1
//사장님 5000만원 넘 많아요 , 좀 적당히 합시다
//3.정상급여
//java MyExceptionEx02 num1
//정상실행.
//4.잘못된 수행 
//java MyExceptionEx02 num1
//실행 매개값의 수가 부족합니다.
//[실행 방법]
//java MyExceptionEx2 num1
public class MyExceptionEx02 {

	public static void main(String[] args) {
		// Buz Rule
		// 최소급여 200 ~ 최대급여 5000
		System.out.println("java MyExceptionEx02 num1");
		try {
			int aa = Integer.parseInt(args[0]);
			if( aa < 200 ) throw new MyException0201();
			if( aa > 5000 ) throw new MyException0202();
			if (args.length < 1) throw new Exception();
		} catch (MyException0201 e) {
			System.out.println(e.getMessage());
		} catch (MyException0202 e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("실행 매개값의 수가 부족합니다");
		}
		

	}

}
