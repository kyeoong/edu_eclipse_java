package och09_ex02;

import java.util.Random;

public class Random01 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		System.out.println("100이하 정수 = " + ran.nextInt(101));
		System.out.println("랜덤 정수 = " + ran.nextInt());   // int에 해당하는 범위의 랜덤수를 준다
		System.out.println("double = " + ran.nextDouble());
		System.out.println("float = " + ran.nextFloat());
		System.out.println("long = " + ran.nextLong());

	}

}
