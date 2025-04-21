package och09_ex01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DayFor1 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println("Date() = " + today);
		
		SimpleDateFormat sdf1,sdf2, sdf3, sdf4;
		sdf1 = new SimpleDateFormat("yyyy /MM /dd");                  // dff1 = 2025 /04 /18
		System.out.println("dff1 = " + sdf1.format(today));
		
		sdf2 = new SimpleDateFormat("yy년 /MM월 /dd일 E요일");			  // dff2 = 25년 /04월 /18일 금요일
		System.out.println("dff2 = " + sdf2.format(today));
		
		sdf3 = new SimpleDateFormat("yy년 /MM월 /dd일 HH:mm:ss:SSS");   // MM : 월 , mm : 분; / dff3 = 25년 /04월 /18일 15:46:03:200
		System.out.println("dff3 = " + sdf3.format(today));
		
		sdf4 = new SimpleDateFormat("yy년 /MM월 /dd일 HH:mm:ss:a");     // a: a.m. or p.m   / dff4 = 25년 /04월 /18일 15:46:03:오후
		System.out.println("dff4 = " + sdf4.format(today));
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다");  		// 
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다"); 		// 현재 달에서 지금 날
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다");  		// 
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다");  		// 
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다"); 	// 
		
		System.out.println("sdf5 = " + sdf5.format(today));
		System.out.println("sdf6 = " + sdf6.format(today));
		System.out.println("sdf7 = " + sdf7.format(today));
		System.out.println("sdf8 = " + sdf8.format(today));
		System.out.println("sdf9 = " + sdf9.format(today));

	}

}
