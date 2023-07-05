package oop;

public class Car1 {

	// 필
	String color;
	int wheelCount;

	// 생성자(Constructor)
	// 기본 생성자는 생략 가능하나, 여러분들은 생략하지 마시기 바랍니다.

	public Car1() {
		System.out.println("sfdjhklsfdj;ksfd");
	}

	// 기본 생성자로 초기화할 수 없을 경우
	// 매개변수가 하나 있는 형태로 객체를 초기화할 수 있다.

	// 생성자 overloading(여러 형태의 매개 변수를 들어갈 수(들어갈 수) 있다. 단 타입이 다르거나, 개수가 달라야 함
	// 생성자의 매개변수명은 이름이 필드명과 같더라도 함수 안에 (로컬) 지역변수이므로 그 안에서만 인식 되므로 필드와 다름
	// 그럼에도 이름을 같게 한 이유는 밖에서 들어온 color를 해당 Ca1의 클래스의 색깔로 넣어주기 위해서 일단은 같게 하셔라.... 
	public Car1(String color) {
		this.color=color;    //this.color는 필드의 color이고, color는 매개변수의 color임
	}

	public Car1(int color) {

	}
	
	public Car1(String color, int wheelCount) {
		this.color=color;
		this.wheelCount=wheelCount;
	}
	
	

	// 메

	void roll() {
		System.out.println("차가 굴러가네");
	}
	
	static void roll2() {
		System.out.println("차가 굴러가네");
	}

}
