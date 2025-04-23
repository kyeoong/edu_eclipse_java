package och12_ex02;

class Th1 extends Thread {
	Th1(String str){
		super(str);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for (int i = 1 ; i <= 20 ; i++) {
			System.out.println(getName() + i);	
		 try {
			Thread.sleep(10);
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		}
	//	super.run();
	}
	
}

class Th2 extends Thread {
	Th2(String str){
		super(str);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i = 1 ; i <=20 ; i++) {
			System.out.println(getName()+ i);
		 try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
		}
	//	super.run();
	}
}

class Ra3 implements Runnable {

	@Override
	public void run() {
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.print(Thread.currentThread().getName() + "대박" + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		
	}


class Ra4 implements Runnable {

	@Override
	public void run() {
		for(int i = 1 ; i <= 20 ; i++) {
			System.out.print(Thread.currentThread().getName() + "월요일" + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		}
	
	}

public class RunnableEx02 {
	// 1.Ra3  :  I/F 20번수행 --> getName()+대박+i
	// 2.Ra4  :  I/F 20번수행 --> getName()+월요일+i
	// 3.Th1  :  Thread 상속  , 수행
	// 4.Th2  :  Thread 상속  , 수행
	public static void main(String[] args) {
		Ra3 r1 = new Ra3();
		Thread r11 = new Thread(r1,"ㅋㅋ");
		Ra4 r2 = new Ra4();
		Thread r22 = new Thread(r2,"ㅎㅎ");
		Th1 th1 = new Th1("aa");
		Th2 th2 = new Th2("bb");
		
		
		r11.start();
		r22.start();
		th1.start();
		th2.start();

	}

}
