package och08_ex07;

public class Audio implements RemoteControl {
	//필드
	private int volume; // 고유 필드
	
	@Override
	public void turnOn() {
		System.out.println("Audio 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio 끕니다");

	}

	@Override
	public void setVolume(int Volume) {
		if(volume > RemoteControl.MAX_VOLUME) {  // RemoteControl.MAX_VOLUME --> 10
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) { // RemoteControl.MIN_VOLUME --> 0 , ? MIN_VOLUME 이라 써도 오류가 안나는 이유
			this.volume = RemoteControl.MIN_VOLUME;   // 이유 : Audio가 RemoteControl을 구현했기 때문에 안에 정의된 상수를 자기 클래스 내부에서 직접 이름을 부르며 쓸 수 있다
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 = " + this.volume);

	}

}
