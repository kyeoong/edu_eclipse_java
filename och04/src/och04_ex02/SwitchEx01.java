package och04_ex02;

public class SwitchEx01 {

	public static void main(String[] args) {
		// HW02
		// IfDiceEx 을 SwitchEx01로 Conversion
		int num = (int)(Math.random()*6)+1;
		
		switch(num) {
		case 1 : 
			System.out.println(num + "번이 나왔습니다");
			break;
		case 2 :
			System.out.println(num + "번이 나왔습니다");
			break;
		case 3 :
			System.out.println(num + "번이 나왔습니다");
			break;
		case 4 : 
			System.out.println(num + "번이 나왔습니다");
			break;
		case 5 :
			System.out.println(num + "번이 나왔습니다");
			break;
		case 6 :
			System.out.println(num + "번이 나왔습니다");
			break;
			
		}

	}

}
