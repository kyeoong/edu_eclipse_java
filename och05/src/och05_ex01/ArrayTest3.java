package och05_ex01;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		//Study 1 Good Ex
		int array[] = {76, 45, 34, 89, 100, 50, 90, 92};
		int sum = 0, avg = 0, max = 0, min = 100;
		//합계와 평균 최대값 최소값 구하기...연습문제
		for(int i = 0; i<array.length ; i++) {
			sum+=array[i];
//			if(array[i]>array[i+1]) {
//				max = array[i];
//				min = array[i-1];
//			}else {
//				max = array[i+1];
//				min = array[i];
//			}
			if(array[i] > max) max = array[i];
			if(array[i] < min) min = array[i];
		} avg = sum/array.length;
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(max);
		System.out.println(min);
		
	}

}
