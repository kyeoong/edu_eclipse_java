package och12_ex03;
// "계좌" 그 자체 (입금, 출금 기능 가짐)
public class Account2 { // 계좌를 나타내는 클래스 (계좌 금액, 입금, 출금 기능 있음)
	int total;   // 계좌 금액
	public Account2(int total) {
		this.total = total;
	}
	
	// 예금
	void deposit(int amt, String name) {
		total += amt;
		System.out.println(name + " 예금 = " + amt);
	}
	
	// 출금
	void withdraw(int amt, String name) {
		if(total >= amt) {
			total -= amt;
			System.out.println(name + " 출금 = " + amt);
			getTotal();
		} else {
			System.out.println(name + "의 출금 요청 " + amt + " 잔액부족 저금을 하는 거 어때 ==> 현재 잔액 : " + total);
		}
	}

	public void getTotal() {
		System.out.println("잔액 = " + total);
	}

}
