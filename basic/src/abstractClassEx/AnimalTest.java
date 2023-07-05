package abstractClassEx;

public class AnimalTest {

	public static void main(String[] args) {
		//new Animal(); 추상클래스는 부모로서의 역할만 하고 객체를 생성할 수 없다. 자식으로 객체를 생성해야만 한다. 그래야지 다양한 형태로 실행을 할 수 있다.(다형성)

		 Dog dog=new Dog();		 
		 dog.sound();		 
		 Cat cat=new Cat();		 
		 cat.sound();
		 System.out.println("============");
		 
		 
		 Animal animal;
		 animal = new Dog();
		 animal.sound();
		 
		 animal = new Cat();
		 animal.sound();
		 System.out.println("============");
		 
		 
		 animalSound(new Dog());
		 animalSound(new Cat());
	}
	
	
	
	static void animalSound(Animal animal){
		animal.sound();
	}

}
