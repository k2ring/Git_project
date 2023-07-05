package inheritance;

public class Human extends Mammal{

	
	public Human() {
	
	}
	
	//메소드 재정의(Override)
	@Override  //컴파일러(이클립스의 jdk에게 override된 코드라고 알려주는 일종의 주석)
	void breathe() {
	
//		super.breathe();
		System.out.println("코로 숨쉰다.");
	}
	
}
