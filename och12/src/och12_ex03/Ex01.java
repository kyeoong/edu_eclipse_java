package och12_ex03;

class G1 extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i< 20 ; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}


class G2 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 20 ; i++) {
			System.out.print("+");
		}
		System.out.println();
		
	}
}


class G3 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 20 ; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}
public class Ex01 {

	public static void main(String[] args) {
		G1 g1 = new G1();
		G2 g2 = new G2();
		G3 g3 = new G3();
		
		// 현장 Work -> start()
		g1.start();
		
		Thread g22 = new Thread(g2);
		g22.start();
		
		Thread g33 = new Thread(g3);
		g33.start();

	}

}
