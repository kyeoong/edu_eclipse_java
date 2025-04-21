package och10_ex04;

public class MyExceptionEx01 {

	public static void main(String[] args) {
		// 
		int kkk = 15;
		
		try {
			// bisness rule 있다
			if (kkk>10) throw new MyException();
		} catch (MyException e) {
			System.out.println(e.getMessage());  // 예외 객체를 만들어 getMessage 메소드 오버라이드 하였기에 "아니 10보다 크다니" 출력
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
