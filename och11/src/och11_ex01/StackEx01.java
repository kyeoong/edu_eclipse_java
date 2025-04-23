package och11_ex01;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		String[] kimchi = {"김치", "깍두기", "파김치", "김치", "겉절이"};
	//  LIFO 구조로 꺼낼 때 스택을 쓰고, 나머지는 리스트 구조를 많이 쓴다
		Stack<String> st = new Stack<String>();
		for(String str : kimchi) {
			System.out.println("push = " + str);
			st.push(str);  // 스택에 string 배열 김치를 넣어다는 소리?
		}
		System.out.println("push st => " + st);
		System.out.println("==========================================");
		while(!st.isEmpty()) {
			System.out.println("POP => " + st.pop());
		}
		System.out.println("POP st =>" + st);
	
	
	
	
	
	}

}
