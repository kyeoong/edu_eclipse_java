package och04_ex01;

public class For01 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <=10; i ++) {
			sum += i;
			System.out.println(i+"까지 합: "+ sum);
		}
		System.out.println("합계:" + sum);
	}

}
