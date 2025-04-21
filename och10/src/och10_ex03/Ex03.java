package och10_ex03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader;
		char[] buffer = new char[100];
		String file_name = ".classpathㅏㅏ";
		try {
			reader = new FileReader(file_name);
			reader.read(buffer, 0 , 90); // buffer는 100이다, buffer = new char[100]
			String str = new String(buffer);
			System.out.println("읽은건 = " + str);
			reader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("그런 파일 없어용");

			
		} catch (IOException e) {
			System.out.println("읽다가 오류 났어요");

			
		} finally {
			System.out.println("읽었어요");
		}
	}

}
