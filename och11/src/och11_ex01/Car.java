package och11_ex01;

public class Car {
	void print() {
		System.out.println("난 차야");
	}
}

class Bus extends Car {
	void print() {
		System.out.println("난 버스야");
	}
	
	void move() {
		System.out.println("승객 50명 이야");
	}
}

class Taxi extends Car {
	void print() {
		System.out.println("난 택시야");
	}
}
