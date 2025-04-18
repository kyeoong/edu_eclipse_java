package och08_ex01;

public interface Volume {
	void volumeUp();
	void volumeDown();
	
}

class TV implements Volume{

	@Override
	public void volumeUp() {
		System.out.println("TV 볼륨 UP");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV 볼륨 DOWN");
	}
	
	public void play() {
		System.out.println("TV 시청");
	}
	
}

class Audio implements Volume {

	@Override
	public void volumeUp() {
		System.out.println("Audio 볼륨 UP");
	}

	@Override
	public void volumeDown() {
		System.out.println("Audio 볼륨 DOWN");
	}
	
}
class Speaker implements Volume {

	@Override
	public void volumeUp() {
		System.out.println("Speaker 볼륨 UP");
	}

	@Override
	public void volumeDown() {
		System.out.println("Speaker 볼륨 DOWN");
		
	}
	
}
