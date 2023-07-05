package instanceofEx;



class Animal {
	void move(){
		System.out.println("동물이 움직임");
	}
}

class Human extends Animal{
	@Override
	void move() {
		System.out.println("사람이 두 발로 걸음");
	
	}
}


class Tiger extends Animal{
	@Override
	void move() {
		System.out.println("호랑이가 네 발로 걸음");
	
	}
}

class Eagle extends Animal{
	
	public Eagle() {
	
	}
	
	@Override
	void move() {
		System.out.println("독수리가 하늘을 난다.");
	
	}
}