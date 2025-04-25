package och04_ex02;

public class IfNextedEx {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		System.out.println("점수 = " + score);
		
		String grade = "";
		//HW01
		//2중 if
		// 1.score 80~84  -> B
		// 2.score 85~89  -> B+
		// 3.score 90~94  -> A
		// 4.score 95~100 -> A+
		
		if(score >= 90) {
			if(score >= 95 ) grade = "A+";
			else grade = "A";
		} 
		else if (score >= 80) {
			if(score >= 85) grade = "B+";
			else grade = "B";
		}
		System.out.println("학점 = " + grade);
	}

}
