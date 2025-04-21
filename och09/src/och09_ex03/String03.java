package och09_ex03;

public class String03 {

	public static void main(String[] args) {
		// 숫자를 문자로 변경
		String str1 = 12+"";
		String str2 = String.valueOf(3); // 숫자모양의 문자열
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		
		// 문자열을 문자로 변경
		char c = str1.charAt(0);
		char d = str1.charAt(1);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

	}

}
