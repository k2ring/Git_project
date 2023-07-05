package anonymous;

import interfaceEx1.RemoteController;

public class Anonymous {

	// 인터페이스 필드 초기값으로 대입하는 방법(익명 클래스를 만들어서)
	// // 인터페이스 타입이므로 객체를 만들수 없다. 그 구현한 클래스가 그 필드에 접근하게 해야함, 그런데 구현 클래스를 긴밀하게 만들고자 할
	// 경우 익명(이름 숨김) 클래스를 선언해서 객체를 만들 수 있다.
	RemoteController field = new RemoteController() {

		@Override
		public void turnOn() {
			System.out.println("TV 켬");
		}

		@Override
		public void turnOff() {
			System.out.println("TV 끔");

		}

		@Override
		public void setVolume(int volume) {

		}

	};

	// 생

	// 메

	void method1() {
		RemoteController localVar = new RemoteController() {

			@Override
			public void turnOn() {

				System.out.println("오디오 켬");
			}

			@Override
			public void turnOff() {
				System.out.println("오디오 끔");

			}

			@Override
			public void setVolume(int volume) {

			}
		};
		
		//로컬 변수 사용
		localVar.turnOn();
		
	}
	
	
	
	void method2(RemoteController remocon) {
		remocon.turnOn();
		remocon.turnOff();
	}
	
	

}
