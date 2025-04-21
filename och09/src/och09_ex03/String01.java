package och09_ex03;

public class String01 {

	public static void main(String[] args) {
		String a1 = "Java"; // String 객체에 문자열 리터럴을 저장
		String a2 = "Java"; 
		String a3 = new String("Java"); // 문자열 상수를 생성자에 전달해서 String 객체를 생성한 예
		String a4 = new String("java");
		String a5 = new String("java");
		
		System.out.println(a1 + " , " + a2 + " , " + a3);
		if(a1 == a2) System.out.println("== a1과 a2는 같다");
		else		 System.out.println("== a1과 a2는 다르다");
		if(a1 == a3) System.out.println("== a1과 a3는 같다");
		else		 System.out.println("== a1과 a3는 다르다");
		
		if(a1.equals(a2)) System.out.println(".equals a1과 a2는 같다");
		else		 System.out.println(".equals a1과 a2는 다르다");
		if(a1.equals(a3)) System.out.println(".equals a1과 a3는 같다");
		else		 System.out.println(".equals a1과 a3는 다르다");
		
		if(a1.equals(a4)) System.out.println(".equals a1과 a4는 같다");
		else		 System.out.println(".equals a1과 a4는 다르다");
		if(a1.equalsIgnoreCase(a4)) System.out.println(".equalsIgnoreCase a1과 a4는 같다");
		else		 System.out.println(".equalsIgnoreCase a1과 a4는 다르다");
		if(a3.equalsIgnoreCase(a4)) System.out.println(".equalsIgnoreCase a3과 a4는 같다");
		else		 System.out.println(".equalsIgnoreCase a3과 a4는 다르다");
		
		
		if(a4 == a5) System.out.println("java == a4과 a5는 같다");
		else		 System.out.println("java == a4과 a5는 다르다");

	}

}
