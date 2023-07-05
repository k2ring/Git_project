package chapter06;

public class Marine {

	int x = 0, y = 0; // Marine (x,y) 의 위치좌표
	int hp = 60; // 현재 체력
	
	// 공유해서 사용하는 경우 클래스로 변수로 선언해야 한다., 각각이 다르게 사용할 경우에는 인스턴스
	static int weapon = 6; // 공격력
	static int armor = 0; // 방어력

	
	public Marine() {
	
	}
	
	
	//인스턴스 메서드는 인스턴스 변수와 관련된 작업을 하고, static 메서드는 static 변수와 관련된 작업
	
	static void weaponUp() {  
		weapon++;
	}

	static void armorUp() {
		armor++;
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
