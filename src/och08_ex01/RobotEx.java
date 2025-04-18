package och08_ex01;

public class RobotEx {
//	Robor r = new DanceRobot();   ===> r instanceof DanceRobot
	static void action(Robot r) {  // ? rb 라고 객체를 선언하였는데 왜 static인가  --> action을 수행하기 위해서
		if(r instanceof DanceRobot) { // instanceof = 객체 타입 비교 , == 는 일반 변수 비교
			DanceRobot dr = (DanceRobot) r; // 캐스팅 이유 알아낼것
			dr.dance();
	//		((DanceRobot) r).dance();  --> 7~8 코드 줄인 형태, (DanceRobot) r = dr 이니깐 dr.dance(); 이다
		} else if (r instanceof DrawRobot) {
			((DrawRobot)r).draw();
		} else {
			SingRobot sr = (SingRobot) r;
			sr.sing();
		}
	}	
	

	public static void main(String[] args) {
		//
		Robot[] rb = new Robot[3];
		rb[0] = new DanceRobot();
		rb[1] = new DrawRobot();
		rb[2] = new SingRobot();
		//             DanceRobot(), DrawRobot(), SingRobot()
		for (Robot r : rb) {  // 로직화  파사드 내용을 하신다
			action(r);
		}

	}

}
