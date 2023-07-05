package Ex6;

class Ex6_9_Marine {
	int x = 0, y = 0; // Marine (x,y) 의 위치좌표
	int hp = 60; // 현재 체력

	// 공유해서 사용하는 경우 클래스변수(static)로 선언해야한다.
	// (각각 다르게 사용할 경우에는 인스턴스 변수로)
	static int weapon = 6; // 공격력
	static int armor = 0; // 방어력

	
	public Ex6_9_Marine() {
		
	}
	
	
	// 인스턴스 메서드는 인스턴스 변수와 관련된 작업을 하고,
	// static 메서드는 static메서드와 관련된 작업을 한다.
	
	static void weaponUp() {	// 
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