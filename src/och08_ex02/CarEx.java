package och08_ex02;

public class CarEx {
	// 멤버 변수
	String  kind;
	int     kk;
	Engine  eg;  // type, cc, print() 종합 선물 세트로 쓸 수 있는 Engine 객체 타입
	
	public CarEx(String kind, Engine eg) {
		this.kind = kind;
		this.eg   = eg;
	}
	
	void print() {
		System.out.println("CarEx의 종류 = " + kind);
		eg.print();
		System.out.println("====================");
	}
	
	public static void main(String[] args) {
		Engine eg1 = new Engine("알파엔진", 5000);
		Engine eg2 = new Engine("베타엔진", 7500);
		
//		CarEx  c1  = new CarEx("투싼",    eg1);
//		c1.print();
//		CarEx  c2  = new CarEx("제네시스", eg1);
//		c2.print();
//		CarEx  c3  = new CarEx("포르쉐",   eg2);
//		c3.print();
		
		CarEx[] car = new CarEx[3];
		car[0] = new CarEx("투싼", eg1);
		car[1] = new CarEx("제네시스", eg1);
		car[2] = new CarEx("포르쉐", eg2);
		
		for(CarEx kk : car) {    // for(CarEx[] kk : car) { 오류
			      kk.print();    // System.out.println(kk);
		}
	}
}
