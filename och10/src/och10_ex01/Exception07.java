package och10_ex01;

public class Exception07 {
	
	static void callDriver() throws ClassNotFoundException {
		System.out.println("callDriver 수행중");
		Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버를 띄어줄 때 쓴다
		System.out.println("callDriver Driver 완료");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("callDriver 호출전");
		
		try {
			callDriver();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("클라스를 찾을 수 없습니다");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("e.getMessage() = " + e.getMessage());
			
		} finally { // 무조건 실행
			System.out.println("시스템 종료");
		}

	}

}
