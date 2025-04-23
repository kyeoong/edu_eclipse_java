package och13;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("읽을 파일명을 입력");
		String fileName = sc.nextLine();
		FileReader fr = new FileReader("src/och13/" + fileName);
		int data = 0;
		while((data=fr.read())!= -1) {  // .read() => Reads a single character. -1 if the end of the stream has been reached
			System.out.print((char)data);
		}
		fr.close();
		System.out.println("\t출력끝");
		sc.close();
	}

}
