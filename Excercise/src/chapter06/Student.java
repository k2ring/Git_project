package chapter06;

public class Student {
	
	String name;  //학생이름
	int ban;  //반
	int no; //번호
	int kor;  //국어점수
	int eng;  //영어점수
	int math;  //수학점수
	
	public Student() {
	
	}
	
	
	
	
	






	public Student(String name, int ban, int no, int kor, int eng, int math) {
		
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}











	public int getTotal(){
		int result =kor + eng +math;
		
		return result;
	}
	
	
	public float getAverage(){
		int result = getTotal();
		float avg=   (int)(result / 3f *10 +0.5f) / 10f;
		return avg;
	}
	
	
	
	
	
	
	String info(){
		int total=getTotal();
		float avg=getAverage();
		return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + total +", " + avg;
	}
	
	
	
	
	
	
	

}
