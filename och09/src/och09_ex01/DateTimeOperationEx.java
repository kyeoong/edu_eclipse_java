package och09_ex01;

import java.time.LocalDateTime;

public class DateTimeOperationEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 시 = " + now);
		LocalDateTime targetDateTime 
				= 	 now.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(5)
				.minusMinutes(9)
				.plusSeconds(10)
				;
		System.out.println("연산 후 = " + targetDateTime);
	}

}
