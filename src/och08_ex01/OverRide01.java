package och08_ex01;

class OverRide0101 {
	private int kkk;
	public void print() {
		System.out.println("부모님 메소드 출력");
	}
	
}

class OverRide0102 extends OverRide0101 {
	// 클래스를 상속받으면 구현이 되어있어 오류가 나지 않는다
	
	public void print3() {
		System.out.println("OverRide0102의 출력");
	}
}

public class OverRide01 {  // 클라스 상속에 대해 배워보자

	public static void main(String[] args) {
		OverRide0101 overRide0101 = new OverRide0101(); // 부모 선언
		overRide0101.print();
		
		OverRide0102 overRide0102 = new OverRide0102(); // 자식 선언
		System.out.println("자식은 부모님 것을 쓸 수 있다");
		overRide0102.print();
		overRide0102.print3();
		
		OverRide0101 ovRide01 = new OverRide0102(); // 선언은 부모 대입은 자식
		ovRide01.print(); // 내가 선언한 것만 쓸 수 있다

	}

}
