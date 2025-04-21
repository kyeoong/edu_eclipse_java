package och09_ex02;

public class Math01 {

	public static void main(String[] args) {
		// 로또
		int[] i = new int[6];
		for(int j = 0; j<6 ; j++) {
			int int01 = (int) ((Math.random()*45)+1);
			i[j] = int01;
		}
		
		for(int j = 0; j <i.length; j++) {
			System.out.println((j+1) + "번 = " + i[j]);
		}

	}

}
