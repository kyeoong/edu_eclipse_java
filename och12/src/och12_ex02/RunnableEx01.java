package och12_ex02;

class Ra1 implements Runnable {

	@Override
	public void run() {
		for(int i =1; i <= 20; i++) {
			System.out.println(i+"대박"+Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
	
}

class Ra2 implements Runnable {

	@Override
	public void run() {
		for(int i =1; i <= 20; i++) {
			System.out.println(i+"화요일"+Thread.currentThread().getName());
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
	}
	
}

public class RunnableEx01 {

	public static void main(String[] args) {
		Ra1 r1 = new Ra1();
		Ra2 r2 = new Ra2();
		Thread a = new Thread(r1,"Pr");  // Thread a = new Thread(r1) 로 돌아가던데 무슨 차이?
		a.start();
		Thread b = new Thread(r2, "no");
		b.start();
	}

}
