package array.quiz;

public class Quiz08 {

	public static void main(String[] args) {

		Student[] student = new Student[3];

		student[0] = new Student(1001, "둘리");
		student[1] = new Student(1002, "또치");
		student[2] = new Student(1003, "도우너");

//		for (int i = 0; i < student.length; i++) {
//			student[i].showInfo();
//		}

		for (Student stu : student) {
			stu.showInfo();
		}
	}

}

class Student {
	int studentID;
	String studentName;

	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public void showInfo() {
		System.out.println("학번: " + studentID + ", 이름: " + studentName);
	}

}