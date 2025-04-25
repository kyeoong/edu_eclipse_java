package och04_ex03;

public class Ex0301 {

	public static void main(String[] args) {
	
		int sum = 0;
		// HW 05
		// for문을 이용 1부터 100, 3의 배수의 합 sum
		// for + if
		//모둘러?
		
		for(int i = 1 ; i < 101 ; i++) {
			if(i%3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("3의 배수의 합 = " + sum);
	}

}
