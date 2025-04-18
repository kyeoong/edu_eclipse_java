package och08_ex04;

public class KumHoTire extends Tire {

	public KumHoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean roll() {
		++accmulateRoatation;  // 누적 회전수
		if(accmulateRoatation < maxRotation) {
			System.out.println(location + "KumHoTire 수명 " + (maxRotation-accmulateRoatation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumHoTire 펑크 ***");
			return false;
		}
	}

}
