package och10_ex01;

public class Exception04 {
	
	static void method01() throws Exception {
		System.out.println("method01 run");
		method02();
	}

	static void method02() throws Exception {
		System.out.println("method02 run");
		throw new Exception(); // 일부로 예외 발생
	}
	
	public static void main(String[] args) throws Exception { // throws Exception 없으면 오류 => 이유 ?
		// 
		method01();
		System.out.println("main End");  // 에러를 던져줬기 때문에 출력되지 않는다
	}

}
