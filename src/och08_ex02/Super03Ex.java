package och08_ex02;

class C01 {
	public C01() {
		System.out.println("C01 매개변수 없는 조상 생성자");
	}
	
	public C01(int x) {
		this();
		System.out.println("C01 매개변수 1개 있는 조상 생성자 = " + x);
	}
}

class C02 extends C01 {
	public C02(int x) {
		super(x); // 조상 class의 1개 매개변수 생성자
		System.out.println("CO2 매개변수 1개 있는 부모 = x = " + x);
	}
	
	public C02(int x, int y) {
		super(x); // 조상 class의 1개 매개변수 생성자
		System.out.println("CO2 매개변수 2개 있는 부모 = x = " + x + " , y = " + y);
	}
}

class C03 extends C02 {
	public C03(int x, int y) {
		super(x,y); // 조상 class의  2개 매개변수 생성자
		System.out.println("C03 매개변수 2개 있는 부모 = x = " + x + " , y = " + y);
	}
	void c3() {
		System.out.println("C03 c3 자식");
	}
}



public class Super03Ex {

	public static void main(String[] args) {
		C03 c3 = new C03(7, 15);
		c3.c3();

	}

}
