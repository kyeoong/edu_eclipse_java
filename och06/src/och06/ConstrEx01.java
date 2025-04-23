package och06;

class Sonata {
	int a = 0;
	String str = "";
	public Sonata() {
		System.out.println("기본 생성자");
	}
	public Sonata(int a) {
		System.out.println("기본 + int 1 = " + this.a);
		this.a = a;
		System.out.println("기본 + int 2 = " + this.a);
	}
	public Sonata(String str) {
		this.str = str;
		System.out.println("기본 + str = " + this.str);
	}
}

public class ConstrEx01 {

	public static void main(String[] args) {
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata(5);
		Sonata s3 = new Sonata("에어백");

	}

}
