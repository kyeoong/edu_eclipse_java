package och08_ex04;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1 ; i<=5 ; i++) {
			int problemLocation = car.run();
			System.out.println("problemLocation = " + problemLocation);
			
			switch(problemLocation) {
			case 1 : 
				System.out.println("앞왼쪽 한국 tire 교체");
				car.frontLeftTire = new HanKookTire("앞왼쪽", 15);
				break;
			case 2 :
				System.out.println("앞오른쪽 금호 Tire 교체");
				car.frontRightTire = new KumHoTire("앞오른쪽", 13);
				break;
			case 3 :
				System.out.println("뒤왼쪽 한국 Tire 교체");
				car.backLeftTire = new KumHoTire("뒤왼쪽", 14);
				break;
			case 4 :
				System.out.println("뒤오른쪽 금호 Tire 교체");
				car.backRigthTire = new KumHoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("----------------------------------");
		}

	}

}
