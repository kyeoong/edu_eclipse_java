package och04_ex01;

public class If03 {

	public static void main(String[] args) {
		// HW02
		// 1. If03 수행시 파라메타를 하나받음(점수)
		
		// 2.score 가지고 if문 수행 
				//    1) 90 >= X          grade = "A";
				//    2) 80<= X <  90    grade = "B";
				//    3) 70<= X <  80    grade = "C";
				//    4) ELSE            grade = "F";
		//  결과 = 당신점수는85 이고 학점은 B입니다
		
		int score = Integer.parseInt(args[0]);
		char grade;
		if (score >= 90) {
			grade = 'A';
			System.out.println("당신의 점수는 " + score + " 이고 학점은 " + grade + " 입니다");
		} else if ( score >= 80 ) {
			grade = 'B';
			System.out.println("당신의 점수는 " + score + " 이고 학점은 " + grade + " 입니다");
		} else if ( score >= 70 ) {
			grade = 'C';
			System.out.println("당신의 점수는 " + score + " 이고 학점은 " + grade + " 입니다");
		} else {
			grade = 'F';
			System.out.println("당신의 점수는 " + score + " 이고 학점은 " + grade + " 입니다");
		}
	}
	
	/**
	 * 	  int score = Integer.parseInt(args[0]);
	 *    String grade = "";
	 *    
	 *    if      ( score >= 90 ) grade = "A";
	 *    else if ( score >= 80 ) grade = "B";
	 *    else if ( score >= 70 ) grade = "C";
	 *    else                    grade = "F";
	 *    
	 *    System.out.println("당신의 점수는 " + score + " 이고 학점은 " + grade + " 입니다");
	 *    // 마지막 출력문은 모두가 거치는 것이므로 중첩되지 않는 방법으로 작성 가능하다
	 * 
	 */

}
