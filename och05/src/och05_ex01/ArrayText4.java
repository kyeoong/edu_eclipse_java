package och05_ex01;

public class ArrayText4 {

	public static void main(String[] args) { // Sort 알고리즘 기초 Sorting의 기본
		
		int array[] = {76,45,34,89,100,50,90,92};
		int Temp = 0;
		
		for(int i = 0; i<array.length; i++ ) {
			for(int j = i + 1 ; j<array.length; j++) {
				if(array[i]>array[j]) {
					Temp=array[i];
					array[i]=array[j];
					array[j]=Temp;
					}
			}
		}
		for(int i = 0; i<array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

}
