package och11_ex01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListHw01 {

	public static void main(String[] args) {
		//총 객체수: 5
		//List : [Java, JDBC, Database, Servlet/JSP, iBATIS]
		//2: Database
		List<String> list = new ArrayList<>();  // 앞에 List 로 선언  --> 로직화(?) 여기 무슨 말일 까 / 앞에 인터페이스에다가 구현 객체를 한거다 / 앞에  List가 인터페이스야?
		list.add("Java");
		list.add("JDBC");
		list.add("Database");
		list.add("Servlet/JSP");
		list.add(3,"iBATIS"); // 만약에 3번 자리에 넣어야 하면 앞에 인덱스 번호를 붙여주면 된다
		
		System.out.println("총 객체 수 = " + list.size());
		System.out.println("List = " + list);
		System.out.println(list.indexOf("Database") + " = " + list.get(2));

		// Database, Servlet/JSP, iBATIS 삭제
		list.remove(2);
		list.remove("Servlet/JSP");  // 3이랑 4 넣었더니 에러 =>  Whyy =>  인덱스 오류가 난다 인덱스 2번을 삭제하면 4번 인덱스는 없다
		list.remove("iBATIS");
		System.out.println(list);
		
		// for문 이용 남은 원소 조회
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		

	}

}
