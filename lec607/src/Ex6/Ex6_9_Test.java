package Ex6;

public class Ex6_9_Test {

	
	// 모든 병사의 공격력과 방어력이 같아야 한다.
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Ex6_9_Marine marine1 = new Ex6_9_Marine();
		System.out.println(marine1.weapon);
		
		marine1.weaponUp();
		System.out.println(marine1.weapon);
		
		Ex6_9_Marine marine2 = new Ex6_9_Marine();	
		System.out.println(marine2.weapon);
		
		marine2.weaponUp();
		System.out.println(marine2.weapon);
	}

}
