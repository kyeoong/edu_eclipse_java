package och08_ex01;

interface Inter0301 {
	void aa();
	
}
interface Inter0302 {
	void bb();
	
}

interface Inter0303 extends Inter0301, Inter0302 { // 다중 상속 가능
	void cc();
	
}

class Inter0304Class implements Inter0303 {

	@Override
	public void aa() {
		System.out.println("aa 메소드");
		
	}

	@Override
	public void bb() {
		System.out.println("bb 메소드");
		
	}

	@Override
	public void cc() {
		System.out.println("cc 메소드");
		
	}
	
	public void dd() {
		System.out.println("dd 메소드"); // Override 아니다 Inter0304Class의 자체 메소드
		
	}
	
}

public class Inter03Ex {

	public static void main(String[] args) {
	//   조상 선언  => class의 dd 메소드 사용 불가
		Inter0303 inter0303 = new Inter0304Class();  // 같은 조상 계통
		inter0303.aa();
		inter0303.bb();
		inter0303.cc();
	//	inter0303.dd(); 
	
		
	//   후손 선언        => 모든 메소드 사용 가능
		Inter0304Class inter0304Class = new Inter0304Class();
		inter0304Class.dd();
	//  앞에 부모형을 선언해야 한다 자식형을 선언하면 안된다
	}

}
