package Ex6;

public class Ex6_3 {

	public static void main(String[] args) {
		Ex6_4 s = new Ex6_4();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : "+s.name);
		System.out.println("총점 : "+s.getTotal());
		System.out.println("평균 : "+s.getAverage());
	}

}
