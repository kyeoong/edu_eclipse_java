package och09_ex03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulaEx {  // 정규 표현식 파일, regex101.com

	public static void main(String[] args) {
		// 
		String[] data = {"bat" , "baby", "bonus"
						, "cA"  , "ca"  , "co" 
						, "c." , "c0"  , "car" , "combat" , "count"
						, "cafe12"  
						, "date", "disc"};
		
		Pattern p = Pattern.compile("c[a-zA-Z]*");  // 패턴.컴파일 바로 쓸 수 있는 이유
		for(int i = 0; i < data.length ; i++) {
			Matcher m = p.matcher(data[i]);			// 매치 클래스? 패턴 변수.매처 쓸 수 있는 이유
			if(m.matches()) {
				System.out.println(data[i] + " , ");
			}
		}

	}

}
