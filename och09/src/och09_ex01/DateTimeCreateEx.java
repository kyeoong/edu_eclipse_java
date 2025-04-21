package och09_ex01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeCreateEx {

	public static void main(String[] args) {
		// 날짜 얻기
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜 = " + currDate);
		LocalDate targetDate = LocalDate.of(2025, 05, 19);
		System.out.println("지정 날짜 = " + targetDate + "\n");
		
		// 시간 얻기
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간 = " + currTime);
		LocalTime targetTime = LocalTime.of(19, 30, 10, 5);
		System.out.println("지정 시간 = " + targetTime + "\n");
		
		// 날짜와 시간 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 = " + currDateTime);
		LocalDateTime targetDateTime = LocalDateTime.of(2019, 11, 15, 17, 50, 30, 5);
		System.out.println("지정 날짜와 시간 = " + targetDateTime + "\n");
		
		// 협정 세계시와 시간존(TimeZone) 
        // UTC : 국제적인 표준 시간의 기준으로 쓰이는 시각
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시 = " + utcDateTime);   // 협정 세계시 = 2025-04-18T07:18:15.571333200Z[UTC]
		ZonedDateTime utcDateTime1 = ZonedDateTime.now();
		System.out.println("협정 세계시 = " + utcDateTime1);  // 협정 세계시 = 2025-04-18T16:18:15.572330600+09:00[Asia/Seoul]
		ZonedDateTime utcDateTime2 = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("협정 세계시 = " + utcDateTime2);  // 협정 세계시 = 2025-04-18T03:20:17.446500700-04:00[America/New_York]
		
	}

}
