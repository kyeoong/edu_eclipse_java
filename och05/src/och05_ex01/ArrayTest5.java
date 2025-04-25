package och05_ex01;
// 복습 MUST 반드시 필히 할 것!!!! 이거 하나만 하면 배열 제대로 할 수 있는것 오늘 배운 것 중 다 중요함 이거 하나 알면 웬만한거 할 수 있다
public class ArrayTest5 {
	public static void main(String[] args) {
		String[] m = {"이름", "국어", "영어", "수학", "총점" , "평균"};
		String[] name = {"김준수", "조정은", "안예은", "전동석"};
		
		int[][] score = {
				{80,70,90},
				{70,90,90},
				{80,70,80},
				{90,90,70}
		};
		
		int[] tot = new int[3];     //과목의 총계
		int sum = 0, avg = 0;
		System.out.println("\t\t성적표 \n");
		
		for(int i = 0; i<m.length; i++)
			System.out.print(m[i]+"\t");

		System.out.println("\n-----------------------------------------------------"); // 여기까지 보고 밑에 작성해보기
			
			//report를 만든다
			
		for(int i = 0; i < score.length; i++) {
			// score가 2차원 배열 이었을 떄 score[i] 1차원 행을 뜻함
			System.out.print(name[i] + "\t");
			for(int j = 0; j<score[i].length; j++) {
				System.out.print(score[i][j] +"\t");
				sum += score[i][j];  	// 사람별 총점
				tot[j] += score[i][j];	// 과목별 총점 (j는 과목의 종계)
			}
			avg = sum / score[i].length;
			System.out.println(sum+"\t"+ avg);
			sum = 0;
				
		}
		System.out.println("=====================================================");
		System.out.print("총계" + "\t");
		int toAvg, toSum = 0;
		for(int j = 0; j < 3 ; j++) {
			System.out.print(tot[j] + "\t");
			toSum += tot[j];
		}
		toAvg = toSum/(score[0].length*name.length);
		System.out.println((toSum + "\t" + toAvg));
		}
	}
