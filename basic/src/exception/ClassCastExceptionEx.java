package exception;

class Animal{	
}

class Dog extends Animal{	
}

class Cat extends Animal{	
}

public class ClassCastExceptionEx {	
	
	public static void main(String[] args) {
		
	Dog dog =	new Dog();
	changeDog(dog);
	
	Cat cat =	new Cat();
	changeDog(cat);
	}

	static void changeDog(Animal animal) {
		
		if(animal instanceof Dog) {
			Dog dog=(Dog)animal;
			System.out.println("강아지 객체 변환 성공");
		}else {
			Cat cat=(Cat)animal;
			System.out.println("고양이 객체 변환 성공");
		}
		
		
	}
	
}
