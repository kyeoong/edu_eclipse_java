package och08_ex01;

//-------------------------------------------------------
//인터페이스는 사용목적
//  1) 양식의 역할( 큼) 함 --> 표준화  
//  2) 다중상속 지원(극히 일부분..)
//  3) class 와 class 를 연결 해줌 (중요)
//-------------------------------------------------------
public interface Inter01 {
	//InterFace 안에 기술된 변수 => 변수가 아니다 상수 Public Static Final 종담변수 (final 변수, 상수)   Static Final = 상수
	int NUM1 = 3;
	//InterFace 안에 기술된 method는 모두 추상 메소드이다 추상 메소드 => 기술하지 않고 정의만 한 것을 말한다
	abstract void display(); // 추상 메소드   , abstract 안써도 된다 밑에랑 똑같다
			 void print();   // 추상 메소드
}
class InterClass implements Inter01 {

	@Override
	public void display() {
		// NUM1 = NUM1 + 3;
		System.out.println("재정의 했어 = " + NUM1);
		
	}

	@Override
	public void print() {
		System.out.println("Today is Wed");
		
	}
	
}
