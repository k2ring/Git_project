package chapter7_2;

public class Point {
	int x;
	int y;
	
	public Point() {
		this(0,0);
	}

	public Point(int x, int y) {
	
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		
		return "["+x+","+y+"]";
	}
}
