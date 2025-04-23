package och11_ex03;

import java.util.Hashtable;

public class HashTableEx01 {

	public static void main(String[] args) {
		
		Hashtable<String, String> ht = new Hashtable<String, String>();  // 해시맵이나 헤시테이블이나 원리가 똑같다
		ht.put("조정은", "010-2222-3333");                                 // put으로 키와 벨류를 넣고 
		ht.put("손흥민", "010-9596-3333");                                 // get으로 객체를 꺼낸다
 		ht.put("황희찬", "010-5639-3333");
		System.out.println("조정은 Tel = " + ht.get("조정은"));
		System.out.println("손흥민 Tel = " + ht.get("손흥민"));
		System.out.println("황희찬 Tel = " + ht.get("황희찬"));
		
	}

}
