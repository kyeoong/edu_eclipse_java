package och13;

import java.io.File;

public class Dir01 {

	public static void main(String[] args) {
	//	File file = new File(".");
		File file = new File("src/och13");
		
		String[] list = file.list();
		System.out.println("list = " + list); // 해시코드

		// 향상형 FOR문
		for(String str : list) {
			System.out.println(str);
		}
	}

}
