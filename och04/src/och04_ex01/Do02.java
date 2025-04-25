package och04_ex01;

public class Do02 {

	public static void main(String[] args) {
		// Home Work
		// do~while While03
		
		int i = 1, j =2;
		
//		do {
//			System.out.print(j + " * " + i + " = " + i*j + "\t");
//			j++;
//			if ( j>9 ) {
//				System.out.println();
//				i++;
//				j=2;
//			}
//		} while(i < 10);
		
		System.out.println("do ~ while");
		do {
			do {
				System.out.println(j + " * " + i + " = " + i*j + "\t");
				j++;
			}while(j<=9);
			System.out.println();
			i++;
			j = 2;
			}while(i <= 9);
		}
	}
