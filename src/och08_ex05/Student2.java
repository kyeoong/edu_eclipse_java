package och08_ex05;

public class Student2 extends Person2 {
	
	private String sno;

	public Student2(String name, int age, String sno) {  // 생성안하면 오류나는 이유
		super(name, age);
		this.sno = sno;
	}
	
	public void print() {
		super.print();
		System.out.println("학번 = " + sno);
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	
}
