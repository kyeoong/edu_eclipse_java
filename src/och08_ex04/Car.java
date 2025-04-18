package och08_ex04;

public class Car {
//  객체이지만 필드
	Tire frontLeftTire = new Tire("앞왼" , 5);
	Tire frontRightTire = new Tire("앞오른" , 3);
	Tire backLeftTire = new Tire("뒤왼" , 1);
	Tire backRigthTire = new Tire("뒤오른", 2);
	
// 생성자
	
// 메소드
	int run() {
		int returnNum = 0;
		System.out.println("[자동차가 달립니다]");
		if(frontLeftTire.roll() == false) {
			stop(); // ? 객체 생성 없이 메소드 호출 가능 - 같은 클래스 안에서는 this.stop(); 도 가능하고, this는 생략해도 된다
			returnNum = 1;
			return returnNum;
		} 
		if(frontRightTire.roll() == false) {
			stop();
			returnNum = 2;
			return returnNum;
		}
		if(backLeftTire.roll() == false) {
			stop();
			returnNum = 3;
			return returnNum;
		}
		if(backRigthTire.roll() == false) {
			stop();
			returnNum = 4;
			return returnNum;
		}
		
		return returnNum;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다]");
	}
	

}

