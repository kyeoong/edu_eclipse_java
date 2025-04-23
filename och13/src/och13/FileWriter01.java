package och13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileWriter01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 파일명");
		String fileName = sc.nextLine();
		System.out.println("저장할 글을 입력하세요");
		String msg = sc.nextLine();
//		FileWriter fw = new FileWriter(fileName);
		FileWriter fw = new FileWriter("src/och13/"+fileName);
		Date date = new Date();
		fw.write(date + " = " + msg);
		fw.close(); // 객체를 열어주면 close 해줘야 한다 필수다! 안해주면 값이 들어가지 않는다!
		System.out.println("출력끝");
		sc.close(); 

	}

}
