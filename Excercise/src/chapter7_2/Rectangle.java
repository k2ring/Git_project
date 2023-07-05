package chapter7_2;

public class Rectangle extends Shape{
	double width; // 폭
	double height;  //높이
	
	public Rectangle() {
	
	}
	
	
	
	
	public Rectangle(double width, double height) {
		
		this.width = width;
		this.height = height;
	}




	boolean isSquare() {
		return width == height ;
	}

	@Override
	double calcArea() {
		
		return width*height;
	}
	
	
}
