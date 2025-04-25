package och04_ex01;

public class Do01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// do~while 변수 초기값 설정
		// While01 변형하였다
		
		int sum = 0, i = 1;
		do {
			sum += i;
			System.out.println(i + "까지 합 " + sum);
			i++;
		} while(i <= 10);
		
		System.out.println("do~while 최종 합계 = " + sum);
	}

}
