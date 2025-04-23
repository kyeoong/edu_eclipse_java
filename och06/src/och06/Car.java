package och06;

public class Car {
	// Member 변수 , 필드 라고 한다
	String color; // 차 색깔
	int    speed; // 속도
	int    wheel; // 바퀴 수 
	
	// 멤버 변수를 가지고 행위를 하는 것을 메소드라 한다 speedUp(),  print()
	// 영문자 또는 $로 시작) 두번째부터 숫자가능
	void speedUp() {
		speed++;
		System.out.println(speed + " speed 속도를 올렸다");
		return;
	}
	
	void print() {
		System.out.println("색깔 = " + color);
		System.out.println("속도 = " + speed);
	}
	
	int getSpeed(int upSpeed) {
		upSpeed += 10;
		System.out.println("Car upSpeed = " + upSpeed);
		speed += upSpeed;
		System.out.println("속도 = " + speed);
		return speed;
	}

}
