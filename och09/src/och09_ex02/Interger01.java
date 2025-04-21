package och09_ex02;

public class Interger01 {

	public static void main(String[] args) {
		String str = "3";
		
		int 	int01 = Integer.parseInt("3"); // int 3
		Integer int02 = Integer.valueOf(str);  // 객체 3
		
		System.out.println(int01 + int02); // int 타입으로 결과가 출력 -> 객체 int02가 unboxing 된다(자바가 자동으로) 
		System.out.println(str + str); // 둘다 String
		System.out.println(int01+str); // 둘 중에 하나가 String이면 String으로 나온다
	}

}
