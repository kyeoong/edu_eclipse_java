package och08_ex03;

public class DmbCellPhone extends CellPhone {
	//필드 
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	@Override
	void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("DmbCELL");  // 오버라이드하면 어떻게 된다 -> 자식 메소드로 나온다
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다");
	}
	
	void changeChannelDmb(int chg) {
		System.out.println ("channel " + chg + "번으로 바꿉니다");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다");
	}

}
