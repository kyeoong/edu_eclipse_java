package och08_ex01;

// 면접 abstract class Vs Interface

abstract class AClass01 {
	final static int BC = 9;
	int kk;
	public AClass01() {// 추상 클래스 생성자
		// 하나 이상의 추상 메소드를 가진 추상 메소드
		System.out.println("추상 Class 생성자");
	}
	
	public void setKk(int kk) {
		this.kk = kk;
	}
	// 하나이상의 추상 메소드가 존재 해야 함
	// 메소드 정의만 있는 것
	abstract void print();  // 추상 메소드라 {} 쓰면 오류
}




class IClass01 extends AClass01 {
	void print3() {
		System.out.println("IClass01의 print3 메소드 본인꺼 구현");
		
	}

	@Override
	void print() {
		System.out.println("AClass01 추상 메소드 실제 구현을 해야한다 kk = " + kk);
		
	}
	
}

public class OverRide03Ex {  // 추상 클래스를 배워보자   인터페이스와 클래스의 중간 관리자 -> 추상

	public static void main(String[] args) {
//		추상 Class instance 안된다
//		AClass01 aClass01 = new AClass01() {    --> 추상 메소드가 있는 추상 클래스는 인스턴스, 객체 구현 불가  / = 뒤에 객체를 만드는 곳은 인터페이스, 추상클래스 안된다
//			
//			@Override
//			void print() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		AClass01 aClass01 = new IClass01();
		aClass01.setKk(12);
		aClass01.print();
//		aClass01.print3();  -> 수행 불가
		
		IClass01 iClass01 = new IClass01();
		iClass01.setKk(7);
		iClass01.print();  // kk 값이 다르다
		iClass01.print3();

	}

}
