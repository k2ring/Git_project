package staticEx;

public class Student1 {
	//필
	
	static int serialNum = 1000; //공유해서 사용하고자 할 경우 static 사용
	int studentID;
	private String studentName;
	int grade;

	
	// 생
	public Student1() {
		serialNum++;
		studentID=serialNum;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// 메
	
	
	
}
