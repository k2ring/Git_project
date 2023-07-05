package interfaceEx1;


//다중 인터페이스 구현 가능
public class Television implements RemoteController, Searchable{

    int volume; 
    
    boolean mute;
	
	@Override
	public void turnOn() {
	
		System.out.println("TV  켬");
	}

	@Override
	public void turnOff() {
		System.out.println("TV  끔");
		
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
		System.out.println("현재 TV 볼륨 : "  +  this.volume);
	}

	@Override
	public void search(String url) {
		
		System.out.println(url + "을 검색");
		
	}

	
	
	@Override
	public void setMute(boolean mute) {
		this.mute=mute;
//		RemoteController.super.setMute(mute);
		
		if(this.mute) {
			System.out.println("TV 무음 처리");
		}else {
			System.out.println("TV 무음 해제");
		}
		
		System.out.println("현재 무음 설정 상태는 " + this.mute);
	}
	
}
