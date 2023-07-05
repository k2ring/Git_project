package interfaceEx1;
//설계도에서도 상위설계도로 어느 범위에서 해야한다는 규제나 가이드 역할을 하면서, 접점역할도 함
public interface RemoteController {
	
	//상수
	public static final int MAX_VOLUME=10;  // public static final은 생략되어있음, 생략되더라고 컴파일 과정에서 붙게 됨	
	public static final int MIN_VOLUME=0;
	
	//추상 메서드
	public abstract void turnOn(); // public abstract은 생략되어있음, 생략되더라고 컴파일 과정에서 붙게 됨
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	//디폴트 메서드(인터페이스가 기본적으로 가지고 있는 메서드)
	public default void  setMute(boolean mute){    //public은 생략됨
		if(mute) {
			System.out.println("무음 처리");
		}else {
			System.out.println("무음 해제");
		}
	}
	
	
	//정적 메서드 (인터페이스에 바로 접근해서 사용가능)
	public static void changeBattery(){  //public은 생략됨
		System.out.println("건전지 교체");
	}


}
