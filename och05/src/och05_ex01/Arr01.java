package och05_ex01;

public class Arr01 {

	public static void main(String[] args) {
		
		int[] a = new int[5]; //5라고 쓰면 [4]까지 쓸 수 있나 왜냐면 인덱스 시작 0 부터이니까!
		a[0] = 7;
		a[1] = 34;
		a[2] = 67;
		a[3] = 6;
		a[4] = 234;
		
		System.out.println("a.length는 배열의 크기 = " + a.length);
		
		for(int i = 0 ; i<a.length; i++) {
			System.out.printf("a[%d]=%d\n", i , a[i]);
		}

	
	int[] b = new int[5];
	b[0] = 98;
	b[1] = 93;
	b[2] = 67;
	b[3] = 6;
	b[4] = 234;
	System.out.println();
	for(int i = 0 ; i<b.length ; i++) {
		System.out.printf("b[%d] = %d\n", i , b[i]);
	}
	
	}

}
