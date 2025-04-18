package och08_ex06;

public class DaoEx {
	
	public static void dbWork(DateAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delect();
	}
	
	public static void main(String[] args) {
//		DateAccessObject oDao = new OracleDao();
//		dbWork(oDao);
		dbWork(new OracleDao());   //  --> 13,14줄 함축
		
		DateAccessObject mDao = new MySqlDao();
		dbWork(mDao);

	}

}
