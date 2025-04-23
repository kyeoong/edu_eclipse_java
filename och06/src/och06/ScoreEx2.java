package och06;

class Score2 {
	int kor, eng, math;
	
	// 국어, 영어, 수학 값을 받아 할당하는 생성자
	
	Score2(int a, int b, int c) {
		this.kor = a;
		this.eng = b;
		this.math = c;
	}
	
	void print() {
		int sum = kor + eng + math;
		System.out.print("국어 = " + kor + ", 영어 = " + eng + ", 수학 = " + math);
		System.out.println(" 총점 = " + sum + ", 평균 = " + sum/3);
	}
}



public class ScoreEx2 {

	public static void main(String[] args) {
		// Score2 sc1 , sc2  Instance 생성 
		// sc1 , sc2  print 출력
		
		 Score2 sc1 = new Score2(78, 88, 97);
		 sc1.print();
		 Score2 sc2 = new Score2(88, 98, 96);
		 sc2.print();

	}
//	국어:78, 영어: 88 , 수학: 97	총점 : 263, 평균 :87
//	국어:88, 영어: 98 , 수학: 96	총점 : 282, 평균 :94
}
