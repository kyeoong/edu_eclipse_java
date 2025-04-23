package och15_ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OraInsert {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("부서번호 입력 = "); String deptno = sc.nextLine();
		System.out.println("부서명 입력	  = "); String dname  = sc.nextLine();
		System.out.println("위치 입력	  = "); String loc    = sc.nextLine();
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url    = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql    = String.format("Insert Into dept Values(%s, '%s', '%s')", deptno, dname, loc); // ''가 없으면 숫자 s인 이유는 문장을 완성하기 위해서 이다
		System.out.println("sql -> " + sql);
		
		Connection conn = null;
		Statement stmt = null;
		
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();
			
			// result 나 result Set
			int result = stmt.executeUpdate(sql); // 수행 -> executeQuery
			if(result>0) System.out.println("입력 성공 ㅎㅎ");
			else		 System.out.println("입력 실패");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(stmt != null) stmt.close();
			if(conn != null) conn.close();
		}
		
		sc.close();

	}

}
