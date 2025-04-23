package och12_ex02;

class Car {
	int k = 0;
}
//원칙1
//Thread 생성시 반드시 extends Thread
//1. 누군가 상속시 extends Thread 불가 하기 때문에  
//2. 추가로 implements Runnable I/F 상속 구현
class Multi extends Car implements Runnable {  // class Multi extends Car 이렇게 상속하면 Thread를 상속할 수 없다
	
	@Override
	public void run() {  // 인터페이스 Runnable을 상속 받았기에 필수로 Run메소드 구현 해야한다
		for(int i =1; i<=10; i++) {
			System.out.print("multi" + i + "\t");
			if(i%10 == 0 ) System.out.println();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
	
}
public class Multinher {

	public static void main(String[] args) {
		Multi m1 = new Multi();
		// implement 한 것은 반드시 아래와 같은 선언후 사용 ->  면접
		// Must --> Thread th1 = new thread(r1)
	//	m1.start(); -> 안됨  면접
		Thread multi1 = new Thread(m1); // 반드시 이렇게 써야한다. 쓰레드를 선언하면서 다시 m1을 써야 한다
		multi1.start();
		
		Thread multi2 = new Thread(m1, "Pr"); // 
		multi2.start();
	}

}
