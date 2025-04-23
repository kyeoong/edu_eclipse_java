package och11_ex01;

import java.util.ArrayList;

public class Animal {

	public static void main(String[] args) {
		ArrayList<String> animal = new ArrayList<String>();
		String[] a = {"산토끼", "고양이", "진돗개", "치와와", "토끼"};
		for(int i =0; i<a.length; i++) {
			animal.add(i, a[i]);
		}
		
		animal.add(1,"판다");
		System.out.println("판다 추가완료!");
		if(animal.contains("진돗개")) System.out.println("진돗개는 있어요!");
	//	for(int i = animal.size()-1 ; i >=0; i--) {
	//		if(animal.size() == animal.indexOf(animal.size())) {  // 왜 에러가 났을까 if(animal.size() == animal[i])  : animal[i] -> 배열 문법이라
	//		if(animal.indexOf(i) == animal.indexOf(animal.size()-1)) { // indexOf(i) -> i라는 문자를 찾게 됨
		String last = animal.remove(animal.size()-1);
		System.out.println("마지막 친구는 " + last + " 였어요 \n인사해줬습니다"); // 치와와가 나오는 이유는 토끼를 제거한 이후의 List 마지막은 치와와라서
		System.out.println("남아있는 친구들은 ");                                                  // 따라서 remove를 할 때 변수에 값을 넣어주고 출력해주면 된다
		for(int i = 0; i <animal.size(); i++) {
			System.out.println((i+1) + "." + animal.get(i)); // get을 생각하지 못함
		}

	}

}
