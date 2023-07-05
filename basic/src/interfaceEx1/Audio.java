package interfaceEx1;

public class Audio implements RemoteController{

    int volume; 
	
	@Override
	public void turnOn() {
	
		System.out.println("오디오  켬");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오  끔");
		
	}

	@Override
	public void setVolume(int volume) {
		
		if(volume > RemoteController.MAX_VOLUME) {
			this.volume = RemoteController.MAX_VOLUME;
		}else if (volume < RemoteController.MIN_VOLUME) {
			this.volume = RemoteController.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 오디오 볼륨 : "  +  this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		
//		RemoteController.super.setMute(mute);
		
		if(mute) {
			System.out.println("오디오 무음 처리");
		}else {
			System.out.println("오디오 무음 해제");
		}
	}
	
	

}
