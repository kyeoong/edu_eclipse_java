package och09_ex04;

public class PersonEx {

	public static void main(String[] args) {
		// 문제 = 주민번호만 같으면 같다가 되도록 하기 
		Person p1 = new Person(1000, "광해");
		Person p2 = new Person(1000, "광해군");
		
		if (p1.equals(p2)) System.out.println("p1 p2 같다"); // 모든 클래스는 Object 클래스를 상속받으므로 equals 메소드를 오버라이딩 할 수 있다
		else			   System.out.println("p1 p2 다르다");
		

	}

}
