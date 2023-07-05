package classEx;

public class Car {
	//필
	String color;
	String model;
	
	//생
	public Car() {
	
	}

	public Car(String color) {
		this.color = color;
	}
	
	
	
	public Car(String color, String model) {
		this.color = color;
		this.model = model;
	}
	//메
	void roll(){
		System.out.println("굴러감");
	}

}
