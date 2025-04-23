package och11_ex01;

import java.util.ArrayList;

public class CarEx01 {

	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList<Car>();
		al.add(new Car());
	// 위에 것을 풀어서 작성한것
		Bus bus = new Bus();
		al.add(bus);
		al.add(new Taxi()); // 선언을 부모로 해야 자식객체도 넣을 수 있다
		for(Car c : al) {
			c.print();  //	c.move(); 아버지 c 라서 MOVE 없다
			//  현장 Work -> 버스의 move() 메소드 호출
			if(c instanceof Bus) {
				Bus b = (Bus) c;
				b.move();
		//	    ((Bus) c).move();
			}
		}

	}

}
