package och08_ex07;

public class Television implements RemoteControl {
// 필드
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");


	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {  // RemoteControl.MAX_VOLUME --> 10
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) { // RemoteControl.MIN_VOLUME --> 0 , ? MIN_VOLUME 이라 써도 오류가 안나는 이유
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 = " + this.volume);

	}

}
