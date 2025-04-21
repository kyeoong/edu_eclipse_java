package och09_ex03;

public class String02 {

	public static void main(String[] args) {
		// 
		char[] c = {'k', 'o', 'r', 'e', 'a' };
		String str1 = new String(c); // 오버로딩 ? 구조가 어떻게 되는거여  -> 연속된 값으로 리턴해 준다 
		String str2 = new String("Fighting");
		// String str1 = new 로 char[] 로 줘도 되고 문자열로 주어도 된다
		String str3 = str1 + str2;
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println(2+1+1+5+"년");
		System.out.println("연1 = " +2+1+1+5);
		System.out.println("연2 = " + (2+1+1+5));
		}

	}

