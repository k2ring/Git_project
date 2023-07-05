package inheritance;

public class Human extends Mammal {

	public Human() {
		
	}
	
	// 메서드 재정의(Override)
	@Override // 컴파일러(이클립스의 jdk)에게 override된 코드라 알려주는 일종의 주석)
	void breathe() {
		
		super.breathe();
		System.out.println("코로 호흡한다.");
	}
}
