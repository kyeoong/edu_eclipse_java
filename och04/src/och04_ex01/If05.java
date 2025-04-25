package och04_ex01;

public class If05 {

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
			grade = "A";
		}
		else if ( score >= 80 ) {
			grade = "B";
		}
		else if ( score >= 70 ) {
			grade = "C";
		}
		else if ( score >= 60 ) {
			grade = "D";
		} else grade = "F";
		
		if ( score >= 100) grade += "+";
		else if (score >= 60 ) {
			if 		( score%10 > 7) 	grade += "+";
			else if ( score%10 < 4 ) 	grade += "-";
			else 						grade += "0";
			
	//		if 		( score%10 > 7) 	grade += "+";
	//		else if ( score%10 > 4 ) 	grade += "0";
	//		else 						grade += "-";
		}
		
		
		System.out.println("당신의 점수는 " + score + " 이고 학점은 " + grade + " 입니다");

	}

}
