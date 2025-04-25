package och04_ex01;

public class WhileBreak01 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		
		while(true) {
			num++;
			sum += num; // 누적
			if(num==5) break;
			
		}
		System.out.println("합계 = " + sum);
		System.out.println("끝");
	}

}
