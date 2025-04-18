package och08_ex02;

class Super01{
//  멤버 변수, 필드
	int a = 7;
	int b = 7;
//  일반 메소드	
	void display() {
		System.out.println("Super01 부모 display");
	}
	
	void print() {
		System.out.println("Super01 난 부모 Print 메소드");
	}
	
}

class Super02 extends Super01{
//  멤버 변수, 필드
	int a =10;
	
	@Override
	void print() {
		// TODO Auto-generated method stub
		// super.print();
		System.out.println("Super02 멤버 a = " + a );  // this가 생략된 것으로 봄 this.a 로 본다
		System.out.println("Super02 부모멤버 a = " + super.a );
		System.out.println("Super02 부모멤버 b = " + b );
	}
}

public class Super01Ex {

	public static void main(String[] args) {
		Super02 s02 = new Super02();                  // 선언과 객체가 동일할 때는 자신의 것을 찾고 같은 이름의 변수에 경우 super로 지정해 줘야 하고 b처럼 없을 경우에는 super 지정 안필요하다
		s02.print();

	}

}
