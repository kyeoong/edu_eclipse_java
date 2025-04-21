package och10_ex02;

public class Throw01 {

	public static void main(String[] args) {
		
		System.out.println("안녕");
		Exception e1 = new Exception("내가 에러 만들었다");
		try {
			System.out.println("e1 1");
			
			int kk3 = 100/0; //  ArithmeticException
			throw e1;
			
		} catch (ArithmeticException e) {
			
			System.out.println("ArithmeticException = " + e.getMessage());
		} catch (Exception e) {
			
			System.out.println("e.getMessage() = " + e.getMessage());
		} finally {
			System.out.println("나는야 무조건 실행");
		}
		
		System.out.println("프로그램 정상 종료");

	}

}
