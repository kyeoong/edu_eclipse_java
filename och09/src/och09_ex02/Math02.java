package och09_ex02;

public class Math02 {

	public static void main(String[] args) {
		// 
		double d1 = 4.156, d2 = 4.67 , d3 = -4.15 , d4 = -4.67;
		// Round -> 반올림
		System.out.println("Round d1 = " + Math.round(d1));
		System.out.println("Round d2 = " + Math.round(d2));
		System.out.println("Round d3 = " + Math.round(d3));
		System.out.println("Round d4 = " + Math.round(d4));
		
		// Floor -> 자기보다 작은 정수 중 가장 큰 것
		System.out.println("floor d1 = " + Math.floor(d1));  // 만나이로 내리자 
		System.out.println("floor d2 = " + Math.floor(d2));
		System.out.println("floor d3 = " + Math.floor(d3));
		System.out.println("floor d4 = " + Math.floor(d4));
		
		// Ceil -> 자기보다 큰 정수 중 가장 작은 것
		System.out.println("ceil d1 = " + Math.ceil(d1));
		System.out.println("ceil d2 = " + Math.ceil(d2));
		System.out.println("ceil d3 = " + Math.ceil(d3));
		System.out.println("ceil d4 = " + Math.ceil(d4));
	}

}
