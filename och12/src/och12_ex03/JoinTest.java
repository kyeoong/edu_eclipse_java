package och12_ex03;

import java.util.ArrayList;

class Before extends Thread {
	public Before(String str) {
		super(str);
	}
	
	void addCar() {
		System.out.println("Before addCar");
		JoinTest.carList.add("Benz");
		JoinTest.carList.add("제네시스");
		JoinTest.carList.add("SM7");
		JoinTest.carList.add("포르쉐");
	}
	
	@Override
	public void run() {
		System.out.println(getName());
		try {
			Thread.sleep(1000); // 1초
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addCar();
	}
}

class After extends Thread {
	public After(String str) {
		super(str);
	}
	
	@Override
	public void run() {    // 다시 써볼까
		System.out.println(getName());
		for(String car : JoinTest.carList) {
			System.out.println(car);
		}
	}
}





public class JoinTest {
	public static ArrayList<String> carList = new ArrayList<String>();
	public static void main(String[] args) {
		// 순서가 없는 쓰레드에 순서를 부여하고 싶을 때  => Before가 실행되어야 에레이리스트에 값이 추가가 되는데 Thread는 순서 없이 실행되다보니 After가 먼저 실행되면 데이터(JoinTest.carList)가 없는 상태로 돌아간다
		Before bf = new Before("우선");
		After af = new After("나중에"); // 조회용
		
		bf.start();
		try {
			bf.join();  // Waits for this thread to die. 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		af.start();

	}

}
