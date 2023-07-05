package interfaceEx1;

public class RemoteControllertest {

	public static void main(String[] args) {
		
//		new RemoteController();
		
		RemoteController remocon;  //인터페이스 변수 선언
		
		remocon = new Television();   // 텔레비젼 객체를 인터페이스 타입에 대입
		 
		remocon.turnOn();  //인터페이스의 turnOn() 호출
		remocon.turnOff();
		
		remocon.setMute(true);// 인터페이스가 가지고 있는 기본(default) 메서드 사용
		
		
		remocon = new Audio();
		
		remocon.turnOn();
		remocon.turnOff();
		remocon.setMute(false);
		
		
		
		
		RemoteController.changeBattery();
	}

}
