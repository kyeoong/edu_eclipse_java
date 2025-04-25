package och05_ex01;

public class Arr03 {

	public static void main(String[] args) {
		
		String[] str = {"산토끼", "고양이", "토끼", "강아지"};
		
		//일반 for문
		for(int i = 0; i<str.length ; i++) {
			// System.out.printf("str[%d] = %d\n", i, str[i]);   // 오류 이유 : str은 String이라 %s로 작성하여야 한다
			System.out.printf("str[%d] = %s\n", i, str[i]);
			// System.out.println(str[i]);
		}
		//향상형 for문
		for(String full : str) {
			System.out.println("향상형 for문 출력");
			System.out.println(full);
		}
	}
}