package Ex6;

public class Ex6_4 {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Ex6_4() {
		
	}
	
//	public Ex6_3(int kor, int eng, int math) {
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
	
	public int getTotal() {
		int result = kor + eng + math;
		
		return result;
	}
	
	public float getAverage() {
		int result = getTotal();
		float avg = (int)(result / 3f * 10 + 0.5f) / 10f;
		return avg;
	}

	String info() {
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math;
	}
	
	
	
	
	public static void main(String[] args) {
	}

}
