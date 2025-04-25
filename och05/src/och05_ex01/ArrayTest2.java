package och05_ex01;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int money = 2680;
		//             0    1   2    3
		int[] unit = {500, 100, 50, 10};
		
		// 각각의 동전이 최대한 나올수 있는 Count
		// 기존 코드
//		for(int i = 0; i<unit.length; i++) {
//			int cnt = money / unit[i];
//			System.out.println(unit[i]+"원짜리 = " + cnt + "개");
//			money %= unit[i];  //모듈러 money = money % unit;
//			System.out.println("money : " + money);
//		}
		
		for(int i = 0; i<unit.length ; i++) {
			int cnt = money/unit[i];
			System.out.println("개수 = " + cnt);
			System.out.println("거스름돈 = " + money%unit[i]);
			cnt = 0;
		}
	}

}
