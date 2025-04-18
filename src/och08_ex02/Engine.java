package och08_ex02;

public class Engine {
	String type; // 알파, 베타
	int    cc;   // 베기량
	
	// 생성자
	public Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}
	
	// 일반 Method
	void print() {
		System.out.println("타입 = " + type);
		System.out.println("배기량 = " + cc);
	}


	}
