package chapter7_2;

public class Exercise7_23 {

	public static void main(String[] args) {
		Circle circle1=new Circle(5.0);
//		System.out.println(circle1.calcArea());
		
		Rectangle rect1=new Rectangle(3,4);
		
//		System.out.println(rect1.calcArea());
		
		Circle circle2=new Circle(1);
//		System.out.println(circle2.calcArea());
		Shape[] arr = {circle1, rect1,circle2};
		
		System.out.println(" :"+sumArea(arr));
	}
	
	static double sumArea(Shape[] arr) {
		
		double tot=0.0;
		for(int i=0;i<arr.length;i++) {
			tot= tot + arr[i].calcArea();
		}
		
		return tot;
	}

}
