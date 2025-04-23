package och06;

public class Car3Ex {

	public static void main(String[] args) {
		// 생성자의 목적 : 1. 메모리를 할당시켜준다 2. 멤버변수 기본 값을 적용해준다
		// new 하고 가장 먼저 실행되는 메소드
		Car3 c1 = new Car3("제네시스", 10,14); // 메모리 항당과 기본값 적용힌다
		Car3 c7 = new Car3();				// 메모리 할당만 한다
		
		
		c7.name = "투싼";
		c7.inTime = 7;
		c7.outTime = 15;
		c1.print();
		c7.print();
	}

}