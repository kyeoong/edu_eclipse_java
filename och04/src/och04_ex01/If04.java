package och04_ex01;

public class If04 {

	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = "";
		//현장 Work     --->  Homework01
		//  X > 97->A+
		//  X < 94->A-
		//  Else -> A0
		
		// 2.score 가지고 if문 수행 
		//    1) 90 >= X          grade = "A";
		//    2) 80<= X <  90    grade = "B";
		//    3) 70<= X <  80    grade = "C";
		//    4) ELSE            grade = "F";
		
		if ( score >= 90 ) {
			if ( score > 97 ) grade = "A+";
			else if ( score < 94 ) grade = "A-";
			else grade = "A";
		}
		else if ( score >= 80 ) {
			if ( score > 87 ) grade = "B+";
			else if ( score < 84 ) grade = "B-";
			else grade = "B";
		}
		else if ( score >= 70 ) {
			if ( score > 77 ) grade = "C+";
			else if ( score < 74 ) grade = "C-";
			else grade = "C";
		}
		else if ( score >= 60 ) {
			if ( score > 67 ) grade = "D+";
			else if ( score < 64 ) grade = "D-";
			else grade = "D";
		} else grade = "F";
		
		System.out.println("당신의 점수는 " + score + " 이고 학점은 " + grade + " 입니다");

	}

}
