package och10_ex01;

public class Exception05 {
	
	static void method01() throws Exception {
		try {
			System.out.println("1.method01 정상 실행");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("2.method01 메소드에서 예외가 처리");
			throw e; // 다시 예외를 발생시킨다
		}
	}

	public static void main(String[] args) {
		System.out.println("main start");
		
		try {
			method01();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("main 메소드에서 예외가 처리");
			
		}

	}

}
