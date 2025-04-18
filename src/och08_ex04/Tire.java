package och08_ex04;

public class Tire {
//  필드
	public int maxRotation;  // 최대 회전수
	public int accmulateRoatation; // 누적 회전수
	public String location;  // 타이어 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accmulateRoatation;  // 누적 회전수
		if(accmulateRoatation < maxRotation) {
			System.out.println(location + "Tire 수명 " + (maxRotation-accmulateRoatation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false;
		}
	}

}
