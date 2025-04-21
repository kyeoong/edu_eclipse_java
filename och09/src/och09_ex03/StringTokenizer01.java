package och09_ex03;

import java.util.StringTokenizer;

public class StringTokenizer01 {

	public static void main(String[] args) {
		// 
		StringTokenizer st = new StringTokenizer("산딸기, 집딸기, 판딸기.집딸기, 알카리딸리" , ".,");
		//      0     1    2    3    4
		//       산딸기 집딸기 판딸기 집딸기 알카리딸기
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

	}

}
