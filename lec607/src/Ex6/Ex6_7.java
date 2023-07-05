package Ex6;

public class Ex6_7 {
	int x;
	int y;

	public Ex6_7(int x, int y) {

		this.x = x;
		this.y = y;
	}

	double getDistance(int x1, int y1) {

		double res1 = (double) ((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));

		double res2 = Math.sqrt(res1);

		return res2;
	}
}