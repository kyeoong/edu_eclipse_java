package och08_ex01;

public class VolumeEx {
	public static void action(Volume kk) {
		if(kk instanceof TV) {
			TV tv = (TV) kk;
			tv.volumeUp();
			tv.volumeDown();
			tv.play();
		}
		if(kk instanceof Speaker) {
			Speaker speaker = (Speaker) kk;
			((Speaker)kk).volumeUp();
			speaker.volumeDown();
		}
		if(kk instanceof Audio) {
			Audio audio = (Audio) kk;
			audio.volumeUp();
			audio.volumeDown();
		}
	}

	
	
	
	

	public static void main(String[] args) {
		// HW02
		// 화면 결과
//		TV Volume 올리기
//		TV Volume 내리기
//		TV 화면을 본다
//		Speaker Volume 올리기
//		Speaker Volume 내리기
//		Audio Volume 올리기
//		Audio Volume 내리기
		
		
		Volume[] vol = new Volume[3];
		vol[0] = new TV();
		vol[1] = new Speaker();
		vol[2] = new Audio(); 
		
		for(Volume kk : vol) {
			action(kk);
		}
		
		for (Volume kk : vol) {
			kk.volumeUp();
			kk.volumeDown();
			if (kk instanceof TV) {
		//		TV tv = (TV) kk;  밑에랑 같은 문장
				((TV)kk).play();
			}
		}

	}
}
