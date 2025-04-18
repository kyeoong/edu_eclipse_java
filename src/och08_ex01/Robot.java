package och08_ex01;

public interface Robot {  // 클라스와 클라스를 연동한다, 로직화 시킬 수 있다

}

class DanceRobot implements Robot {
	void dance() {
		System.out.println("춤을 춥니다");
	}
}

class DrawRobot implements Robot {
	void draw() {
		System.out.println("그림을 그립니다");
	}
	
}

class SingRobot implements Robot {
	void sing() {
		System.out.println("노래를 부릅니다");
	}
	
}