package och06;

public class Car3 {
	String name;
	int inTime;   // 입고 시간
	int outTime;  // 출고 시간
	int fee;      // 주차 요금
	final int AMTPERTIME = 3000; // final 마지막까지 절대 변하지 않는 변수, 보통 대문자로 작성
	
	// OverLoading 생성자 오버로딩
	public Car3() {
		System.out.println("기본 생성자");
	}
	
	//      메소드명 안에 괄호 안에 있는 것을 파라메타
	public Car3(String n, int inTime, int out) {
		this.name = n;
		this.inTime = inTime; // 파라메타와 멤버변수 이름이 같아서 값이 Clear 된다 따라서 this를 붙이는 것을 권고 this는 멤버 변수 super는 상속 받은 부모 클래스 생성자
		this.outTime = out;
		System.out.println("파라메타 생성자");
	}
	
	void print() {
		int fee = ( outTime - inTime ) * AMTPERTIME;
		System.out.println("차 이름 = " + name);
		System.out.println("입고 시간 = " + inTime);
		System.out.println("출고 시간 = " + outTime);
		System.out.println("주차 요금 = " + fee);
		System.out.println("========================");
	}
}
