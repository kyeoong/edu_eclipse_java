package och08_ex01;

public interface Lenderable02 {
		boolean BORROW = true;
		boolean NORMAL = false;
		abstract void checkOut(String borrower, String date);  // abstract 생략 가능
		void checkIn();

}

class SeperateVolume1 implements Lenderable02 {
	String title;
	String date;
	String borrower;
	boolean	   status;    // 초기값 없으면 false
	
	public SeperateVolume1(String title) {
		this.title = title;
	}
	
//  책 대여  --> NOMAL  , 빌릴때
	@Override
	public void checkOut(String borrower, String date) {
		if (status != NORMAL) return;
		this.date     = date;
		this.borrower = borrower;
		status		  = BORROW;  // true 로 변경
		System.out.println(borrower + "이가 " + date +"일에 " + title + "을 대여했다");
		
	}
//   책 반환 --> BORROW , 반납때
	@Override
	public void checkIn() {
		if (status != BORROW) return;
		System.out.println(borrower + "가 " + title + "을 반납했다");
		date     = null;
		title    = null;
		borrower = null;
		status   = NORMAL;
		
	}

}
	
