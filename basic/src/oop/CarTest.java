package oop;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println(new Car1());
		
		Car1 mycar=new Car1();
		System.out.println(mycar);
		
		mycar.color="red";		
		System.out.println(mycar.color);
		
		mycar.roll();
		
	}

}
