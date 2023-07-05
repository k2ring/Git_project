package staticEx;

public class Student {

	// 필
	static int serialNum = 1001;	// 공유해서 사용하고자 할 경우 static 사용
	private String studentName;
	int grade;
	
	
	// 생
	public Student() {

	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	// 메
	
	
}
