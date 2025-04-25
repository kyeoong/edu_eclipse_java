package och05_ex01;

public class ArrCopy01 {

	public static void main(String[] args) {
		
		// Index->  0 1 2 3 4 5 6
		int[] a = {1,2,3,4,5,6,7};
		int[] b = new int [10];
		System.out.println("-------a, 0, b, 0, a.length---------");
		// a의 Index 0 fmf -> Target Index 0 복사[a.length 만큼]
		System.arraycopy(a, 0, b, 0, a.length); // arraycopy도 메소드 인가? 숫자는 인덱스 시작 주소인가?
		System.out.println("b => " + b); // System.out은 b를 해시코드로 인식한다
		pr(b);							 // 따라서 b의 값을 보고 싶다면 하나하나 풀어서 보아야한다
		cls(b);
		pr(b);
		
		System.out.println("-------a, 0, b, 2, a.length---------");
		System.arraycopy(a, 0, b, 2, a.length);
		pr(b);
		cls(b);
		
		System.out.println("-------a, 1, b, 0, a.length-1---------"); // a.length라 하면 에러난다 이유는 a배열의 범위를 초과하였기 때문
		System.arraycopy(a, 1, b, 0, a.length-1);
		pr(b);
		cls(b);
		
		System.out.println("-------a, 1, b, 3, a.length-1---------");
		System.arraycopy(a, 1, b, 3, a.length-1);
		pr(b);
		cls(b);
		
	}
	// main에서 호출하는 method는 같은 static(Must)
	
	private static void cls(int[] b) { // clear 클리어한다
		for(int i = 0 ; i < b.length ; i++) {
			b[i] = 0;
		}
	}
	
	private static void pr(int[] b) { // pr = print;;
		for(int i = 0 ; i < b.length ; i++) {
			System.out.print(b[i] + "\t");
		}
		System.out.println();
		
	}

}
