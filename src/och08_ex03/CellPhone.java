package och08_ex03;

public class CellPhone {
	// 필드
	String model;
	String color;
	
	// 생성자 = 내부 생성
	
	// 메소드
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	void bell() {
		System.out.println("bell이 울립니디");
	}
	
	void sendVoice(String message) {
		System.out.println("본인 = " + message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방 = " + message);
	}
	
	void hangup() {
		System.out.println("통화 끊습니다");
	}

}
