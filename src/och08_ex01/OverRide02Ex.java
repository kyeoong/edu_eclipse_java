package och08_ex01;

class OverRide0201 {
	void print1() {
		System.out.println("부모님 메소드, 바꾸기 가능");
	}
	
	final void print2() {
		System.out.println("부모님 메소드, 변경 금지");
	}
}

class OverRide0202 extends OverRide0201 {
	@Override
	void print1() {
		// TODO Auto-generated method stub
	//	super.print1();
		System.out.println("자식 출력, 바꾸기 가능");
	}
	
	void print3() {
		// TODO Auto-generated method stub
	//	super.print1();
		System.out.println("자식의 고유 메소드");
	}
}


public class OverRide02Ex {

	public static void main(String[] args) {
		OverRide0201 overRide0201 = new OverRide0201(); // 부모 선언 부모 대입
		overRide0201.print1();
		overRide0201.print2();
	//  overRide0202.print3(); 자식 메소드 사용 안된다

		
		OverRide0201 overRide02 = new OverRide0202();   // 부모 선언 자식 대입
		overRide02.print1();  // 자식 출력, 바꾸기 가능  => 이유 궁금 왜 자식 메소드 출력  -> OverRide 했기 때문이다
		overRide02.print2();
	//  overRide0202.print3(); 자식 메소드 사용 안된다
	//  그러나 OverRide하여 구현한 Methoad로 실행된다  --> 알아두기
	
		
		OverRide0202 overRide0202 = new OverRide0202();  // 자식 선언 자식 대입
		overRide0202.print1();
		overRide0202.print2();
		overRide0202.print3();

	}

}
