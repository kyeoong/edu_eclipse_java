package och08_ex01;

// 공부 -> int를 boolean으로 바꾸기 Lenderable02에서 해보기
public interface Lenderable {
	int BORROW = 1;
	int NORMAL = 0;
	abstract void checkOut(String borrower, String date);
	void checkIn();

}

class SeperateVolume implements Lenderable {
	String title;
	String date;
	String borrower;
	int	   status;    // 초기값 없으면 0
	
	public SeperateVolume(String title) {
		this.title = title;
	}
	
//  책 대여  --> NOMAL  , 빌릴때
	@Override
	public void checkOut(String borrower, String date) {
		if (status != NORMAL) return;  // 0
		this.date     = date;
		this.borrower = borrower;
		status		  = BORROW;  // 1로 변경
		System.out.println(borrower + "이가 " + date +"일에 " + title + "을 대여했다");
		
	}
//   책 반환 --> BORROW , 반납때
	@Override
	public void checkIn() {
		if (status != BORROW) return;  // 1
		System.out.println(borrower + "가 " + title + "을 반납했다");
		date     = null;
		title    = null;
		borrower = null;
		status   = NORMAL;
		
	}
	
}
