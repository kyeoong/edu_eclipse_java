package och06;

class Subscribe {
	public String 	name;
	//동일 Class 내부에서만 접근가능
	private String 	telnum;    // 외부에서 수정 불가 => 100개의 telnum을 각각 넣으면 유지보수때 힘들어짐
	private int 		age;
	
	public Subscribe(String name, String telnum, int age) {
		this.name = name;
		this.telnum = telnum;
		this.age = age;
	}
	
	public Subscribe(String name) {
		this.name = name;
	}
	
	void ChgTelNum(String tel) {
		telnum = tel;
		return;
	}
	
	void ChgAge(int age) {
		// 회사 전략을 위한 비즈니스 룰이 생겨난다
		if ( age > 20 ) this.age = age;
		else 			System.out.println("회사 내규");
	}

	
	int AgeRet() {
		return this.age;
	}

	void print() {
	//	System.out.printf("이름: %s   전화번호: %s   나이: %d    \n", name, telnum, age);
		System.out.printf(" 이름   : %s    전화번호 : %s  나이 : %d  \n" , name, telnum , age);
		System.out.println("==========================================================================");
	}
}


public class SubscribeEx {

	public static void main(String[] args) {
		Subscribe s1 = new Subscribe("이성계", "010-1236-9857", 25);
		Subscribe s2 = new Subscribe("김유신");
		 // s2.age = -10;
		s2.ChgAge(20);
		s1.print();
		s2.print();


	}

}
