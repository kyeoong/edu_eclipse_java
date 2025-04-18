package och08_ex01;

public class LenderOverRiding02 {

	public static void main(String[] args) {
		SeperateVolume1 seperateVolume1 = new SeperateVolume1("보건교사 안은영");
		seperateVolume1.checkOut("정세랑", "21년도");
		seperateVolume1.checkIn();
	}

}
