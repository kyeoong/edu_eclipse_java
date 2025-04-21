package och09_ex01;

import java.util.Calendar;
import java.util.Date;

public class Calender01 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();  // new 안쓰는 이유 : getInstance()를 보고 싱글톤 추측됨
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;  // 미국에서 0월 부터 시작하므로 +1을 해야 현재 월이 나온다
		int date = cal.get(Calendar.DATE);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다\n", year, month, date);
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get((Calendar.SECOND));
		System.out.printf("지금은 %d:%d:%d 입니다 \n", hour, min, sec);
		
		Date dt = cal.getTime();
		System.out.println("cal.getTime() = " + dt);
		
		int dy1 = cal.get(Calendar.DAY_OF_MONTH); // 달에서 몇 일이냐
		System.out.println("Calendar.DAY_OF_MONTH = " + dy1);
		
		int dy2 = cal.get(Calendar.DAY_OF_YEAR); // 올해 새해 부터 오늘까지 일이 몇 일이냐
		System.out.println("Calendar.DAY_OF_YEAR = " + dy2);
	}

}
