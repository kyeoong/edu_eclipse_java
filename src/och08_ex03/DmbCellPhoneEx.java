package och08_ex03;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "파랑", 10);
		System.out.println("model = " + dmbCellPhone.model);
		System.out.println("color = " + dmbCellPhone.color);
		// dmbCellPhone의 필드
		System.out.println("channel = " + dmbCellPhone.channel);
		
		//CellPhone으로부터 상속 받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("Hello");
		dmbCellPhone.receiveVoice("Hello, I'm Kyeong Min");
		dmbCellPhone.sendVoice("Nice to Meet You");
		dmbCellPhone.hangup();
		
		//dmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}
//	모델: 자바폰
//	색상: 검정
//	채널: 10
//	DmbCell 전원을 켭니다.
//	벨이 울립니다.
//	자기: 여보세요
//	상대방: 안녕하세요! 저는 홍길동인데요
//	자기: 아~ 예 반갑습니다.
//	전화를 끊습니다.
//	채널 10번 DMB 방송 수신을 시작합니다.
//	채널 12번으로 바꿉니다.
//	DMB 방송 수신을 멈춥니다.
}
