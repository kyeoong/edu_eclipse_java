package och06;

public class CarEx {

	public static void main(String[] args) {
	//   int     a     = 10;   기존 선언
	// 객체타입  객체변수   = 객체를 선언할 때는 new 쓰고 객체를 선언한다
		int upSpeed = 30;
		Car mycar = new Car(); // 객체 생성
		
		
		mycar.color = "열정의 빨강";
		mycar.speed = 200;
		mycar.speedUp();
		mycar.print();
		
		System.out.println("getSpeed = " + mycar.getSpeed(upSpeed));
		System.out.println(mycar.speed);
		System.out.println("main upSpeed = " + upSpeed);
		
		// main이 있는 곳에서 실행하여야 한다
		
		Car yourcar;
		yourcar = new Car(); // 객체 생성
		
		yourcar.color = "초록";
		yourcar.speed = 150;
		yourcar.print();
	}

} //  201 열정의 빨강, 201  40, 240  , 30 
