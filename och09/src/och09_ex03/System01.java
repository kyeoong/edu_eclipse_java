package och09_ex03;

public class System01 {

	public static void main(String[] args) {
		// 
		String path = System.getenv("path");
		System.out.println("path = " + path);
		
		String JAVA_HOME = System.getenv("JAVA_HOME");  // System.getenv -> 환경변수를 가져오는 메소드, 윈도우는 대소문 구별 안한다 -> System.getenv("java_home") 동일한 값 출력
		System.out.println("JAVA_HOME = " + JAVA_HOME);

	}

}
