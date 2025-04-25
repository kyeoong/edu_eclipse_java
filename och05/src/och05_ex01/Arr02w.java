package och05_ex01;

public class Arr02w {

	public static void main(String[] args) {
		int[] a = new int[] {23,45,67,789,2};
		int[] a2 = {23,45,67,789,2};
		
		System.out.println("a 일반형 For");
		for(int i = 0; i<a.length ; i++) {
			System.out.printf("a[%d] = %d\n", i, a[i]);
		}
		
		System.out.println("===== * 향상형 For문(실무) =========");
		// 				{23,45,67,789,2}  pointer 이동
		for(int kk : a) { // a는 객체이며 a는 주소값을 kk에게 전달한다
			System.out.println("kk = " + kk);
		}
	}

}
