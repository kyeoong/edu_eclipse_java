package och08_ex01;

public class LenderableEx {

	public static void main(String[] args) {
		SeperateVolume sv = new SeperateVolume("해리포터");
		sv.checkOut("경민", "25년 04월 17일");
		sv.checkIn();
		
		SeperateVolume1 sc = new SeperateVolume1("주토피아");
		sc.checkOut("노경민", "2025-04-18");
		sc.checkIn();

	}

}
