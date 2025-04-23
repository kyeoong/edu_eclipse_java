package och11_ex01;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();  // 프로젝트할 때는 <객체>로 하겠다
	// ArrayList<String> al = new ArrayList<>();
		al.add("구형2");  // 배열은 아니다
		al.add("구형8");
		al.add("구형2");
		al.add("구형4");
		al.add("구형3");
		al.add("구형1");
		
		for(int i = 0; i <al.size(); i++) {
			System.out.println(al.get(i));   // 내가 넣은 대로 나오네 , 중복도 허용되네
		}
		
		System.out.println("=========================");
		for (String str : al) {
			System.out.println(str);
		}

	}

}
