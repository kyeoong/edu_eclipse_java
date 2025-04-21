package och09_ex03;
// REVIEW MUST  **
public class String05 {

	public static void main(String[] args) {
		//          인덱스   012345(.)6789
		String fullName = "Hello.java";
		int index = fullName.indexOf('.');
		System.out.println(index);  // 5
		int jIndex = fullName.indexOf('j');
		System.out.println(jIndex); // 6
		
		String fileName = fullName.substring(0,index); // 0에서 부터 5까지의 인덱스 값을 가져온다
		System.out.println("substring(0, index) = " + fileName);
		
		String ext = fullName.substring(index+1); // 6부터 준다 , 값을 하나만 주면 처음부터 끝까지 값을 가져온다
		System.out.println(fullName+"의 확장자는 " + ext);

	}

}
