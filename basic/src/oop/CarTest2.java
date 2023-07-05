package oop;

public class CarTest2 {

	public static void main(String[] args) {
		
		
		new Car1();

//		Car1 mycar2=new Car1("blue");
//		
//		System.out.println(mycar2.color);
		
		
		Car1 mycar3=new Car1("green", 4);
		
		System.out.println(mycar3.color);
		System.out.println(mycar3.wheelCount);
		
		
		mycar3.roll();
		
		Car1 mycar4=new Car1("green", 4);
		mycar4.roll();
		
		
		
		Car1.roll2();
	}

}
