
package och09_ex04;

public class Person {
	int id;
	String name;
	
	// Work
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override   // ? 상속도 된게 아닌데 오버라이드가 된다고?  --> Object를 상속 받았다
	public boolean equals(Object obj) { // ? obj에 어떤게 들어가는 것인가  -> p1.equals(p2) => 내부적으로는 this = p1, obj = p2
		// TODO Auto-generated method stub
//		return super.equals(obj);
		
		boolean b = false;
		
		Person person = null; // ? 이건 무슨 의미  -> 초기화한거ㅑ, 변수를 미리 선언하여서 초기값을 null로 줬다
		if(obj instanceof Person) person = (Person) obj;
		if(obj != null && this.id == person.id) b = true; // ? 조건식은 뭘 판별하려는 것?
		//                  p1    ==   p2
		return b;
	}

}
