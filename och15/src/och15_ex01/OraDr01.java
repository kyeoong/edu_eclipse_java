package och15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;

public class OraDr01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		//                                 개발 DB
		String url    = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	//	String url    = "jdbc:oracle:thin:@172.30.1.26:1521:xe";
	//	String url    = "jdbc:oracle:thin:@localhost:1521:xe";
		System.out.println("Start1");
		try {
			// Oracle Driver Memory Up Loading
			Class.forName(driver);
			System.out.println("Start2");
			Connection conn = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("Start3");
			if (conn != null) {
				System.out.println("Success 연결 성공");
			} else {
				System.out.println("Fail");
			}
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//System.out.println(e.getMessage());
			System.out.println("Error");
		}
	}

}
