package och12_ex01;

class Th3 extends Thread {
	
	Th3(String str) {
		super(str);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i = 0; i <=10 ; i++) {
			System.out.print(getName() + "대박"+ i +"\n");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	
	}
}

class Th4 extends Thread {
	Th4(String st){
		super(st);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i = 0; i <= 20; i++) {
			System.out.print(getName() + "화요일" + i +"\n");
			try {
				sleep(20); // Thread.sleep(20)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
	
}

public class ThreadEx04_Hw03 {

	public static void main(String[] args) { 
		
	// Hw03
	// 20번씩 수행
	// Th3 -> 10 / 1000 쉼 
	// Th4 -> 20 / 1000 쉼
		Th3 t1 = new Th3("TH3..");
		Th4 t2 = new Th4("Th4...");
		t1.start();
		t2.start();
		
	}
	
//	Th3...대박1
//	Th4...화요일1
//	Th3...대박2
//	Th3...대박3
//	Th3...대박4

}
