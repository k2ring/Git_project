package oop;

public class TakeTrans {

	// main 메서드 밖에서는 객체를 만드는 행위(주소를 만드는)를 할 수 없다.
	// new Student();

	public static void main(String[] args) {
		Student hong1 = new Student("홍일동", 5000);
		Student hong2=new Student( "홍이동", 10000);

//		System.out.println(hong1.money);

		Bus bus100 = new Bus(100);
//		
		hong1.takeBus(bus100);

		hong1.showInfo();

		bus100.showInfo();

		System.out.println("=============");
		Subway sub5 = new Subway(5);
		hong1.takeSubway(sub5);

		hong1.showInfo();

		sub5.showInfo();
		
		System.out.println("=============");
		
		Subway sub6 = new Subway(6);
		hong2.takeSubway(sub6);
		hong2.showInfo();
		sub6.showInfo();
		System.out.println("=============");
		
		hong1.takeSubway(sub6);
		hong1.showInfo();
		sub6.showInfo();
	}

}
