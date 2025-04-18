package och08_ex07;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc = null;
		RemoteControl.changeBattery();
//		RemoteControl.setMute(true);  --> 실행불가
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setVolume(15);  // MAX 초과
		rc.setMute(true);
		rc.setMute(false);
		rc.setMute2(true);

	}

}
