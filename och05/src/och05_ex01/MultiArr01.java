package och05_ex01;
// 복습 MUST
public class MultiArr01 {

	public static void main(String[] args) {
		
		int[][] a = new int[2][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 11;
		a[1][1] = 12;
		a[1][2] = 13;
		
		for (int i = 0; i < a.length; i++) { // 행 2
			for(int j = 0; j < a[i].length; j++) { // 열 3
				System.out.print("일반 For " + a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=====================향상형 For문 알아야 합니다========================");
		for( int[] k1 : a) {// a[0], a[1]
			for (int k2 : k1) { // 0번행 a[0] ==> [0][0], [0][1], [0][2]
								// 1번행 a[1] ==> [1][0], [1][1], [1][2]
				System.out.print("확장 For "+ k2 +"\t");
			}
		}
		System.out.println();
	}

}
