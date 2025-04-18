package och08_ex07;

public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int Volume);
	
	// Java 8 이상
	// --------------------------------------------------------
    // 디폴트    메소드    --> 실행 불가하다
    // static  메소드    --> 인터페이스 일지라도 호출해서 실핼 할 수 있다
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		} else {
			System.out.println("무음 해제합니다");
		}
	}
	
	default void setMute2(boolean mute) {
		if(mute) {
			System.out.println("무음2 처리합니다");
		} else {
			System.out.println("무음2 해제합니다");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교체합니다");
	}
}
