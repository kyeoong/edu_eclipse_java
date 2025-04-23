package och12_ex01;

class A1 extends Thread {  // A1 은 쓰레드 상속을 받았기 때문에 쓰레드다
	public A1(String str) {
		super(str); // 아버지는 넘어온 값을 가지고 A1의 쓰레드 이름을 만들어 준다
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		for(int i = 0; i<=100; i++) {
			System.out.print(getName() + i + "\t"); // getName() => 스레드의 이름을 반환
			if( i%10 == 0 ) System.out.println();
			
			try {
				Thread.sleep(50); // sleep() => 1000분의 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			super.run();
		}
	}
}

public class ThreadEx01 {

	public static void main(String[] args) throws InterruptedException { // main도 히나의 쓰레드이다 
		A1 a1 = new A1("subA");
		A1 a2 = new A1("subB");
//		a1.run(); // start() Thread 시작, run() 메소드 호출 3:34
//		a2.run();
		a1.start(); // start() Thread 시작, run() 메소드 호출 3:34
		a2.start();
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.print("Main "+ i + "\t");
			Thread.sleep(30);
			if(i %10 == 0) System.out.println();
		}
	}

}
