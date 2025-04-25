package och05_ex02;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int weekNum = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("WeekNum = " + weekNum);
// 일요일 = 1, 월요일 = 2, DAY_OF_WEEK => 일의 몇번째인지 출력
		switch(weekNum) {
		case 1 :
			today = Week.SUNDAY; break;
		case 2 :
			today = Week.MONDAY; break;
		case 3 :
			today = Week.TUESDAY; break;
		case 4 :
			today = Week.WEDNESDAY; break;
		case 5 :
			today = Week.THURSDAY; break;
		case 6 :
			today = Week.FRIDAY; break;
		case 7 :
			today = Week.SATURDAY; break;
		}
		System.out.println("오늘 요일 = " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다");
		} else {
			System.out.println("열심히 자바 공부합니다");
		}
	}

}
