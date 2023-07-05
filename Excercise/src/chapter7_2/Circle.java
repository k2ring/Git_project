package chapter7_2;

public class Circle extends Shape{
	double r; //반지름
	
	public Circle() {
	
	}
	
	
	public Circle(double r) {
		this(new Point(0,0), r);
	}
	
	public Circle(Point p, double r){
		super(p);
		this.r=r;
	}
	

	@Override
	double calcArea() {
		
		return Math.PI * r * r;
	}
}
