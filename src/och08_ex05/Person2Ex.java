package och08_ex05;


//부모 person = new 자식(); up casting OK
//부모 method()와 자식 method() 이름을 같을 때는  자식 메소드 실행
//부모의 멤버변수와 자식의 멤버변수가 이름이  같을 때는 부모 멤버변수 실행
//
//자식 rv2 = new 부모(); down casting X  --> 하지 말란 소리
//자식 rv3 = (자식)부모객체;  down casting
//강제 형변환 하면 
//1) 문법적 에러가 없음 
//2) 에러가 있을 때도 없을 때도 있다
//
//동물1 = new 사람();
//동물2 = new 사자();
//
//사람 s1 = (사람)동물1
//사람 s2 = (사람)동물2
//
//동물1 instanceof 사람  true
//동물2 instanceof 사람  false


public class Person2Ex {

	public static void main(String[] args) {
		Person2[] person = new Person2[5];  // 5명
		person[0] = new Student2("옥주현", 23, "1234567");
		person[1] = new Student2("김유신", 53, "123475869");
		person[2] = new Teacher2("대조영", 48, "JAVA");
		
		person[3] = new Manager2("우원식", 38, "뮤지컬");
		person[4] = new Manager2("박나래", 40, "개그우먼");
		
		for(Person2 p : person) {
			p.print();
			if(p instanceof Manager2) {
				Manager2 m = (Manager2) p;
				System.out.println("추가 = " + m.getPart());
			}
		}

	}

}
