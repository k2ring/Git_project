package chapter7_2;

public abstract class Shape {

	Point p;

	public Shape() {

	}

	public Shape(Point p) {

		this.p = p;
	}

	abstract double calcArea();

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}
