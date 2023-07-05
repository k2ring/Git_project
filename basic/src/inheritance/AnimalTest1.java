package inheritance;

class Animal{
	
	void move(){
		System.out.println("동물이 움직임");
	}
}

class Human2 extends Animal{
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



public class AnimalTest1 {

	public static void main(String[] args) {
		
		moveAnimal(new Human2());
		moveAnimal(new Tiger());
		moveAnimal(new Eagle());
		
		new Eagle().move();

	}
	
	
	static void moveAnimal(Animal ani){
		ani.move();
	}
	
	

}
