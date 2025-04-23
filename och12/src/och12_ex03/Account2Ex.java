package och12_ex03;

// Thread 생성, "그 계좌를 사용하는 사람", 사용자 스레드
class Account2User extends Thread { // 계좌를 사용하는 유저를 스레드(Thread)로 표현한 클래스
	Account2 act; // Account2User의 멤버변수, 계좌 객체 , 직접 계좌를 가지고 있지 않아서 계좌를 "참조"해서 입금/출금을 실행
	boolean flag;
	
	public Account2User(Account2 act, String name) {
		super(name); // Thread의 이름 설정
		this.act = act; 
	}
	
	@Override
	public void run() {
		for( int i = 0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (act) {
				if (flag) act.deposit((int) (Math.random()*10000), getName());
				else	  act.withdraw((int)(Math.random()*10000), getName());
				flag    = !flag; // flag SWAP
			}
		}
	}
}
public class Account2Ex { // 실행 클래스

	public static void main(String[] args) {
		// 드라큘라 그룹   => 드라큘라
		Account2 act1 = new Account2(10000);  // 같은 그룹끼리 act1 계좌로 예산 만 원을 공유한다 
		// men Group => bts
		Account2 act2 = new Account2(15000);
		
		Account2User au1 = new Account2User(act1, "김준수");
		Account2User au2 = new Account2User(act1, "조정은");
		Account2User au3 = new Account2User(act1, "전동석");
		
		Account2User au4 = new Account2User(act2, "정국");
		Account2User au5 = new Account2User(act2, "v");
		Account2User au6 = new Account2User(act2, "지민");
		
		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
		au6.start();
		

	}

}
