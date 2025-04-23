package och06;

class Inc1 {
	int 		num1;  // 일반 변수, 멤버 변수
	static int	num2;  // 클라스 변수
	
	public 	Inc1() {
		num1 ++;
		num2 ++;	
	}
	void print() {
		System.out.println("num1 = " + num1 + "   num2 = " + num2);
	}
}

public class NumEx {

	public static void main(String[] args) {
		Inc1 a1 = new Inc1();
		a1.print();
		Inc1 a2 = new Inc1();
		a2.print();
		Inc1 a3 = new Inc1();
		a3.print();

	}

}