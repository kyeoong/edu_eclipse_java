package och08_ex02;

class Cons1 {
//  생성자가 없으면 Default를 Compiler가 만들어 준다.
	public Cons1(){
		System.out.println("Cons1 매개변수 업는 부모 생성자");
	}
	
	public Cons1(String str) {
		System.out.println("Cons1 매개변수 1개 부모 생성자 = " + str);
	}
	
	void cc1Method() {
		System.out.println("Cons1 cc1 야호! 목요일이다");
	}
}

class Cons2 extends Cons1 {
	public Cons2() {
		super("헐"); // 매개변수 1개 부모 생성자 호출
		System.out.println("Cons2 매개변수 없는 자식 생성자");
	}
	
	void cc1Method() {
		System.out.println("Cons2 야호! 목요일이다");  // OverRide , 상속자 사이에 같은 이름의 메소드가 있을 때 -> 자식 메소드가 우선이다
	}
	
	void cc2Method() {
		System.out.println("Cons2 자식 Method cc2");
	}
}

public class Super02Ex {

	public static void main(String[] args) {
		Cons2 c2 = new Cons2();
		c2.cc2Method();
		c2.cc1Method();
	}

}
