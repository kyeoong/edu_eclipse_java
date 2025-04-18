package och08_ex01;

interface Inter0201 {
	void first();
	
}

interface Inter0202 extends Inter0201 { //인터페이스끼리는 구현(implement)가 아닌
	void second();						// extends(확장)를 한다
	// interface Inter0202는 void first(), void second() 가지고 있다
}

interface Inter0203 extends Inter0202 { // 부모한테 (Inter0202) 상속 받는다 부모 것을 쓸 수 있다
	void third();
	
}

class InterClass0204 implements Inter0203 { // 다르면 implements
// class InterClass0204 implements Inter0203 {} 선언 후 에러 이유
// = 추상 메소드 구현해야 한다

	@Override
	public void second() {
		System.out.println("Inter0202에 있는 Second Method");
		
	}

	@Override
	public void first() {
		System.out.println("Inter0201에 있는 First Method");
		
	}

	@Override
	public void third() {
		System.out.println("Inter0203에 있는 Third Method");
		
	}
	
}

public class Inter02Ex{
	public static void main(String[] args) {
		//부모꺼 내꺼
		InterClass0204 interClass0204 = new InterClass0204();
		interClass0204.first();
		interClass0204.second();
		interClass0204.third();
		
		// 앞에 조상 객체 선언 가능  => 반대로 하지 말 것
		// 조건 = 선언되어있는 객체의 Method만 사용 가능
		Inter0202 inter0202 = new InterClass0204();  // inter0202의 것을 쓸 수 있다 메모리는 클래스
	//     조상 선언          =     실제 쓸 객체
		inter0202.first();
		inter0202.second();
	//	inter0202.third(); 안됨
	}
}