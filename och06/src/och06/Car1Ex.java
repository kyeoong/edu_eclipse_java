package och06;


class Car1 {
//  공유 변수  ---> Class 변수
	static int    speed; // static => 공유 변수 speed => 전역변수
	// Member 변수 , 필드 라고 한다
	String color; // 차 색깔
	int    wheel; // 바퀴 수 
	
	
	
	// 멤버 변수를 가지고 행위를 하는 것을 메소드라 한다 speedUp(),  print()
	// 영문자 또는 $로 시작) 두번째부터 숫자가능
	void speedUp() {
		speed++;
		System.out.println("speed 속도를 올렸다");
	}
	
	void print() {
		System.out.println("색깔 = " + color);
		System.out.println("속도 = " + speed);
		System.out.println("========================");
	}

}


public class Car1Ex {

	public static void main(String[] args) {
		Car1.speed = 130;
		// Car 클래스와 
		Car1 car1 = new Car1();
		Car1 c2 = new Car1();
		car1.print();
		car1.color = "열정의 빨강";
		c2.color = "노랑이";
		car1.speed = 200;
		car1.print();
		c2.print();
	}

}
